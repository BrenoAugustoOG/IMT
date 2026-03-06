from collections import deque

fatia_tempo = 3

PROCESSOS = {
    'Processo 1': 2,
    'Processo 2': 10,
    'Processo 3': 6,
    'Processo 4': 5,
}

fila = deque()
for nome, tempo in PROCESSOS.items():
    fila.append([nome, tempo])

tempo_atual = 0
tempos_saida = {}

while fila:
    nome, tempo_restante = fila.popleft()
    tempo_executado = min(fatia_tempo, tempo_restante)
    tempo_atual += tempo_executado
    tempo_restante -= tempo_executado
    
    if tempo_restante == 0:
        tempos_saida[nome] = tempo_atual
    else:
        fila.append([nome, tempo_restante])

for nome in PROCESSOS.keys():
    print(f"{nome}: {tempos_saida[nome]} unidades de tempo")