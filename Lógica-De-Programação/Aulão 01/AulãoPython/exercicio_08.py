# 8. um programa que verifique se uma string fornecida pelo usuário é um palíndromo (ou seja, se ela permanece a mesma quando lida de trás para frente). Por exemplo, "radar" é um palíndromo, mas "python" não é.
palavra_digitada = str(input('Digite aqui a palavra que deseja verificar se é palíndromo'))

palavra_invertida = palavra_digitada[::-1]

if palavra_digitada == palavra_invertida:
    print(f'A palavra {palavra_digitada} é um palíndromo {palavra_invertida}')
else: 
    print(f'A palavra {palavra_digitada} não é um palíndromo')