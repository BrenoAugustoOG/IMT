import math
a = int(input("Número A: "))
b = int(input("Número B: "))
c = int(input("Número C: "))

if a==0:
    print("Não é 2º Grau")
else:
    delta = b**2-4*a*c

    if delta < 0:
        print("Não tem raízes reais")
    else:
        x1 = (-b+math.sqrt(delta))/2*a
        x2 = (-b-math.sqrt(delta))/2*a

        print(x1,x2)
