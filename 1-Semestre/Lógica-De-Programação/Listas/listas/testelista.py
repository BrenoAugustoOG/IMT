alturas = []
soma = 0
quantidade = 0
while True:
    entrada = float(input('Digite a sua altura: '))
    if entrada <= 0:
        break
    else:
        alturas.append(entrada)
        soma = soma + entrada
        quantidade += 1

print(alturas)
media = sum(alturas) / len(alturas) #sum -> faz a soma e o len -> descobre quantos elementos tem na lista
print(f'A media vale {media:.2f}')