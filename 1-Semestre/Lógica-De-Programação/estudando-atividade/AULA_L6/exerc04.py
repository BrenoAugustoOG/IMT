from math import sqrt

#Entrada de Dados
a = float(input("Digite aqui o valor de A: "))
b = float(input("Digite aqui o valor de B: "))
c = float(input("Digite aqui o valor de C: "))

#Checa se existe uma equação de segundo grau4
if a != 0:
    delta = b**2 - 4*a*c
    if delta >= 0:
        x1 = (-b + sqrt(delta))/(2*a)
        x2 = (-b - sqrt(delta))/(2*a)
        print(f'As raízes reais são {x1:.2f} e {x2:.2f}.')
    else:
        print('O discriminante é negativo! Não há raizes reais!')
else:
    print('Temos a = 0. Não se trata de uma equação de segundo grau.')