x = float(input('Digite o primeiro valor: '))
y = float(input('Digite o segundo valor: '))
z = float(input('Digite o terceiro valor: '))
codigo = input('Digite o código para ordenação: ')

if codigo == 'c':
    if x >= y:
        if z >= x:
            print(f'A Ordem Crescente é: {y}, {x}, {z}')
        elif z >= y:
            print(f'A Ordem Crescente é: {y}, {z}, {x}')
        else:
            print(f'A Ordem Crescente é: {z}, {y}, {x}')
    elif z >= y:
        print(f'A Ordem Crescente é: {x}, {y}, {z}')
    elif z >= x:
        print(f'A Ordem Crescente é: {x}, {z}, {y}')
    else:
        print(f'A Ordem Crescente: {z}, {x}, {y}')

elif codigo == 'd':
    if x >= y:
        if z >= x:
            print(f'A Ordem Decrescente é: {z}, {x}, {y}')
        elif z>=y:
            print(f'A Ordem Decrescente é: {x}, {z}, {y}')
        else:
            print(f'A Ordem Decrescente é: {x}, {y}, {z}')
    elif z >= y:
        print(f'A Ordem Decrescente: {z}, {y}, {x}')
    elif z >= x:
        print(f'A Ordem Decrescente é: {y}, {z}, {x}')
    else:
        print(f'A Ordem Decrescente é: {y}, {x}, {z}')
else:
    print('Código Inválido!')