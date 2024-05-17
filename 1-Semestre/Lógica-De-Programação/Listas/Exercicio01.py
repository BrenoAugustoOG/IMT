# 1- Desenvolva um código em python que recebe 5 valores numéricos e utilizando lista, guarde-os. Na saída do código é necessário que mostre qual foi o maior e menor valor digitado e suas respectivas posições *OBRIGATÓRIO ESTRUTURA DE DECISÃO E LAÇO

num_lista = []
maior = 0
menor = 0

for c in range(0, 5):
    num_lista.append(int(input(f'Digite aqui um valor para a posição {c}')))
    if c == 0:
        maior = menor = num_lista[c]
    else:
        if num_lista[c]>maior:
            maior = num_lista[c]
        elif num_lista[c]<menor:
            menor = num_lista[c]
print('$'*30)
print(f'Você digitou os valores {num_lista}')
print(f'O maior valor digitado foi {maior}')
print(f'O menor valor digitado foi {menor}')