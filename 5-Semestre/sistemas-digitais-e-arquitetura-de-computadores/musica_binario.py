import numpy as np
import sounddevice as sd
from scipy.io import wavfile

# --- CONFIGURAÇÕES DO SISTEMA ---
# Definição dos parâmetros fundamentais para a modulação e o canal acústico
RA = "24014966"
TAXA_AMOSTRAGEM = 44100
DURACAO_NOTA = 0.5
FREQ_BASE = 400
PASSO_FREQ = 100        
NOME_ARQUIVO = f"{RA}.wav"

# --- LÓGICA DE TRADUÇÃO (MODULAÇÃO) ---

def hex_para_freq(caractere_hex):
    """Mapeamento linear para converter dígito hexadecimal em frequência senoidal."""
    valor = int(caractere_hex, 16)
    return FREQ_BASE + (valor * PASSO_FREQ)

def freq_para_hex(freq):
    """Mapeamento inverso: identifica o dígito hexadecimal a partir da frequência de pico."""
    valor = round((freq - FREQ_BASE) / PASSO_FREQ)
    valor = max(0, min(15, valor)) 
    return hex(valor)[2:].upper()

# --- PARTE A: TRANSMISSOR (SÍNTESE) ---

def gerar_sinal(string_hex):
    """Transforma a mensagem hexadecimal em uma onda senoidal composta (Modulação FSK)."""
    sinal_completo = []
    t = np.linspace(0, DURACAO_NOTA, int(TAXA_AMOSTRAGEM * DURACAO_NOTA), endpoint=False)
    
    for char in string_hex:
        f = hex_para_freq(char)
        # Geração da portadora senoidal pura
        onda = 0.5 * np.sin(2 * np.pi * f * t)
        
        # Implementação de Envelope para mitigação de transientes (suavização de cliques)
        envelope = np.ones_like(onda)
        tamanho_fade = int(len(onda) * 0.1)
        envelope[:tamanho_fade] = np.linspace(0, 1, tamanho_fade)
        envelope[-tamanho_fade:] = np.linspace(1, 0, tamanho_fade)
        
        sinal_completo.append(onda * envelope)
        
    return np.concatenate(sinal_completo)

def salvar_wav(nome_arq, sinal):
    """Persistência dos dados digitais em formato de áudio (WAV)."""
    sinal_normalizado = (sinal * 32767).astype(np.int16)
    wavfile.write(nome_arq, TAXA_AMOSTRAGEM, sinal_normalizado)
    print(f"Arquivo {nome_arq} exportado.")

def reproduzir_audio(sinal):
    """Simulação do canal de transmissão acústica (Saída de som)."""
    print("Iniciando reprodução sonora...")
    sd.play(sinal, TAXA_AMOSTRAGEM)
    sd.wait()

# --- PARTE B: RECEPTOR / DECODIFICADOR (ANÁLISE) ---

def decodificar_wav(nome_arq):
    """
    Simula o recebimento do sinal. Utiliza a técnica de FFT (Transformada Rápida de Fourier) 
    para converter o sinal do domínio do tempo para o domínio da frequência.
    """
    fs, dados = wavfile.read(nome_arq)
    if dados.dtype == np.int16:
        dados = dados / 32767.0
        
    amostras_por_nota = int(fs * DURACAO_NOTA)
    total_notas = len(dados) // amostras_por_nota
    hex_decodificado = ""
    
    for i in range(total_notas):
        # Janelamento: segmenta o áudio para analisar uma nota por vez
        segmento = dados[i * amostras_por_nota : (i + 1) * amostras_por_nota]
        
        # APLICANDO FFT:
        # A FFT decompõe o sinal e identifica quais frequências compõem aquele segmento.
        resultado_fft = np.fft.rfft(segmento)
        frequencias = np.fft.rfftfreq(len(segmento), 1/fs)
        
        # Identificação da frequência dominante (maior magnitude)
        freq_pico = frequencias[np.argmax(np.abs(resultado_fft))]
        
        # Conversão da frequência detectada de volta para o caractere original
        hex_decodificado += freq_para_hex(freq_pico)
        
    return hex_decodificado

# --- EXECUÇÃO DO DIÁLOGO MUSICAL ---

if __name__ == "__main__":
    print(f"--- Laboratório 1: Sistema de Resposta Automática (RA: {RA}) ---")
    
    # 1. TRANSMISSÃO: Codifica o dado original em áudio
    sinal_audio = gerar_sinal(RA)
    salvar_wav(NOME_ARQUIVO, sinal_audio)
    reproduzir_audio(sinal_audio)
    
    # 2. RECEPÇÃO: O sistema "lê" o áudio e decodifica via FFT
    resultado = decodificar_wav(NOME_ARQUIVO)
    
    # 3. VALIDAÇÃO: Comparação entre o dado enviado e o recebido
    print("\n--- RESULTADOS DO DIÁLOGO ---")
    print(f"Mensagem Enviada:    {RA}")
    print(f"Mensagem Recebida:   {resultado}")
    
    if RA.upper() == resultado.upper():
        print("Status: Transmissão bem-sucedida. Comunicação íntegra.")
    else:
        print("Status: Falha na comunicação - erro de decodificação.")