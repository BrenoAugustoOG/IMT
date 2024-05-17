n = int(input('Quantas pessoas irão votar: '))

i = 0 
candidato_01 = 0
candidato_02 = 0
candidato_03 = 0 
branco = 0
nulo = 0

while(i < n):
    voto = int(input('Digite o seu voto: '))
    i = i + 1
    if voto == -1:
        nulo = nulo + 1
        print('O seu voto foi constado em nosso sistema, muito obrigado por votar!')
    elif voto == 0:
        branco = branco + 1
        print('O seu voto foi constado em nosso sistema, muito obrigado por votar!')
    elif voto == 1:
        candidato_01 = candidato_01 + 1
        print('O seu voto foi constado em nosso sistema, muito obrigado por votar!')
    elif voto == 2:
        candidato_02 = candidato_02 + 1
        print('O seu voto foi constado em nosso sistema, muito obrigado por votar!')
    elif voto == 3:
        candidato_03 = candidato_03 + 1
        print('O seu voto foi constado em nosso sistema, muito obrigado por votar!')
    else:
        print('O valor digitado não representa nenhum candidato, desculpe!')

if candidato_01 > candidato_02 and candidato_01 > candidato_03:
    vencedor = 1
if candidato_02 > candidato_01 and candidato_02 > candidato_03:
    vencedor = 2
if candidato_03 > candidato_01 and candidato_03 > candidato_02:
    vencedor = 3

print(f'Total de votos para candidatos \n 1- {candidato_01}\n 2- {candidato_02}\n 3- {candidato_03}')
print('Total de votos brancos ', branco)
print('Total de votos nulos ', nulo)
print('Candidato vencedor: ', vencedor)