import tkinter as tk
from tkinter import ttk, messagebox
import numpy as np
import sounddevice as sd
import time

FS = 44100  # sample rate

# Motivo "clássico" de 5 notas (audível e com cara de chamada/resposta).
# Você pode ajustar depois se quiser "mais parecido" ao seu ouvido.
THEME_5 = [262, 330, 392, 523, 784]  # C4, E4, G4, C5, G5

def sine_tone(freq_hz: float, dur_s: float, volume: float = 0.35) -> np.ndarray:
    t = np.linspace(0, dur_s, int(FS * dur_s), endpoint=False)
    wave = np.sin(2 * np.pi * freq_hz * t)

    # Envelope simples (ataque/decay) para ficar menos "beep"
    attack = int(0.015 * FS)
    release = int(0.030 * FS)
    env = np.ones_like(wave)
    if attack > 0:
        env[:attack] = np.linspace(0, 1, attack)
    if release > 0:
        env[-release:] = np.linspace(1, 0, release)

    return (volume * wave * env).astype(np.float32)

def play_freq(freq_hz: float, dur_s: float = 0.28, volume: float = 0.35):
    audio = sine_tone(freq_hz, dur_s, volume)
    sd.play(audio, FS)
    sd.wait()

def clamp(x, lo, hi):
    return max(lo, min(hi, x))

def semitone_shift(freq: float, semitones: int) -> float:
    # Temperamento igual: 12 semitons por oitava
    return freq * (2 ** (semitones / 12))

def play_theme_5(dur_s=0.35, gap_s=0.10, volume=0.35):
    for f in THEME_5:
        play_freq(f, dur_s, volume)
        time.sleep(gap_s)

def play_hex_as_close_encounters(hex_str: str, dur_s=0.28, gap_s=0.08, volume=0.35):
    """
    Estratégia "filme":
    - O motivo tem 5 notas base.
    - Cada dígito hex escolhe qual nota base (posição i%5)
    - E aplica um desvio em semitons baseado no valor 0..15
      (cria 'frases' com o mesmo DNA do motivo)
    """
    s = hex_str.strip().upper()

    if len(s) == 0:
        raise ValueError("Digite algum código hexadecimal.")
    if any(c not in "0123456789ABCDEF" for c in s):
        raise ValueError("Use apenas dígitos hexadecimais: 0-9 e A-F.")
    if len(s) > 64:
        raise ValueError("Limite de 64 dígitos para não ficar muito longo.")

    for i, ch in enumerate(s):
        v = int(ch, 16)  # 0..15
        base = THEME_5[i % 5]

        # Mapeia 0..15 para um deslocamento musical agradável:
        # -6 .. +9 semitons (uma faixa boa e "expressiva")
        shift = v - 6

        f = semitone_shift(base, shift)
        f = clamp(f, 180, 2000)  # garante audível e confortável

        play_freq(f, dur_s, volume)
        time.sleep(gap_s)

class App(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Lab 1 Prof. Nuncio  — Hex para Música")
        self.geometry("520x260")
        self.resizable(False, False)

        frm = ttk.Frame(self, padding=14)
        frm.pack(fill="both", expand=True)

        ttk.Label(frm, text="Código Hexadecimal:", font=("Segoe UI", 11)).grid(row=0, column=0, sticky="w")
        self.hex_var = tk.StringVar(value="19BFCBF")
        self.entry = ttk.Entry(frm, textvariable=self.hex_var, width=42, font=("Consolas", 14))
        self.entry.grid(row=1, column=0, columnspan=3, sticky="we", pady=(6, 10))
        self.entry.focus_set()

        # Controles
        ttk.Label(frm, text="Duração nota (ms):").grid(row=2, column=0, sticky="w")
        ttk.Label(frm, text="Pausa (ms):").grid(row=3, column=0, sticky="w")
        ttk.Label(frm, text="Volume (0.05–1.0):").grid(row=4, column=0, sticky="w")

        self.dur_var = tk.IntVar(value=280)
        self.gap_var = tk.IntVar(value=80)
        self.vol_var = tk.DoubleVar(value=0.35)

        ttk.Spinbox(frm, from_=80, to=1200, increment=10, textvariable=self.dur_var, width=10).grid(row=2, column=1, sticky="w")
        ttk.Spinbox(frm, from_=0, to=800, increment=10, textvariable=self.gap_var, width=10).grid(row=3, column=1, sticky="w")
        ttk.Spinbox(frm, from_=0.05, to=1.0, increment=0.05, textvariable=self.vol_var, width=10).grid(row=4, column=1, sticky="w")

        btns = ttk.Frame(frm)
        btns.grid(row=5, column=0, columnspan=3, pady=(14, 0), sticky="we")

        ttk.Button(btns, text="Tema (5 notas)", command=self.on_theme).pack(side="left", padx=(0, 10))
        ttk.Button(btns, text="Tocar código HEX", command=self.on_play_hex).pack(side="left", padx=(0, 10))
        ttk.Button(btns, text="Limpar", command=self.on_clear).pack(side="left")

        self.status = tk.StringVar(value="Pronto.")
        ttk.Label(frm, textvariable=self.status, foreground="#444").grid(row=6, column=0, columnspan=3, sticky="w", pady=(12, 0))

        frm.columnconfigure(0, weight=1)

        # Enter toca o HEX
        self.bind("<Return>", lambda e: self.on_play_hex())

    def _get_params(self):
        dur_s = self.dur_var.get() / 1000.0
        gap_s = self.gap_var.get() / 1000.0
        vol = float(self.vol_var.get())
        vol = clamp(vol, 0.05, 1.0)
        return dur_s, gap_s, vol

    def on_theme(self):
        try:
            dur_s, gap_s, vol = self._get_params()
            self.status.set("Tocando tema de 5 notas...")
            self.update_idletasks()
            play_theme_5(dur_s=dur_s, gap_s=gap_s, volume=vol)
            self.status.set("Pronto.")
        except Exception as ex:
            messagebox.showerror("Erro", str(ex))
            self.status.set("Erro.")

    def on_play_hex(self):
        try:
            dur_s, gap_s, vol = self._get_params()
            hx = self.hex_var.get()
            self.status.set(f"Tocando HEX: {hx.strip().upper()}")
            self.update_idletasks()
            play_hex_as_close_encounters(hx, dur_s=dur_s, gap_s=gap_s, volume=vol)
            self.status.set("Pronto.")
        except Exception as ex:
            messagebox.showerror("Erro", str(ex))
            self.status.set("Erro.")

    def on_clear(self):
        self.hex_var.set("")
        self.entry.focus_set()
        self.status.set("Pronto.")

if __name__ == "__main__":
    App().mainloop()
