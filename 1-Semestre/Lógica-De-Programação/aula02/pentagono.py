import math
lado = float(input("O tamanho do lado do pentágono: "))
area = (5*lado**2) / (4*math.tan(math.radians(36)))
print('A área do Pentágono vale:', area)
