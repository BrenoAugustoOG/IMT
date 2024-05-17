N = int(input('N = '))
soma = 0

for i in range(N):
    nome = input('Nome = ')
    salario = float(input('Salário = '))
    soma = soma + salario
    
    if i == 0:
        maior = salario
        resposta = nome
    else:
        if salario > maior:
            maior = salario
            resposta = nome

media = soma/N
print('Média salarial = ', media)
print(resposta, 'é a pessoa que tem o maior salário')