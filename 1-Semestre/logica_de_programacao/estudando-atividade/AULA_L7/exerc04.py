import math
brinquedo = int(input('Digite aqui o valor original do Brinquedo: '))
codigo = int(input('Digite aqui o tipo de brinquedo que deseja sendo: \n 1- Brinquedo que usam baterias \n 2- Brinquedos que usam pilhas \n 3- Brinquedos com baterias recarregáveis'))

if codigo == 1 and brinquedo >= 1000:
    bateria = brinquedo - (brinquedo/100)*10
    print(f'O valor do brinquedo seria de: {bateria}\n')

elif codigo == 2 and brinquedo >= 100:
    pilha = brinquedo - (brinquedo/100)*5
    print(f'O valor do brinquedo seria de: {pilha}\n')

elif codigo == 3 and brinquedo >= 500:
    recarregavel = brinquedo - (brinquedo/100)*10
    print(f'O valor do brinquedo seria de: {recarregavel}\n')