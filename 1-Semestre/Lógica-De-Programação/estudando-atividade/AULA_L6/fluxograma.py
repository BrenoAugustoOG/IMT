idade = float(input("\n\n\n Insira a sua idade: "))
carta = float(input("\n\n\n Você tem carta? \n 0 - Não tenho \n 1- Tenho "))

if idade >= 18 and carta == 0:
    print("\n\n\n Você pode dirigir!")

elif idade >= 18 and carta == 1:
    print("\n\n\n Você tem idade, porém não tem permissão para dirigir sem carta!")

elif idade <= 18:
    print("\n\n\n Você não pode dirigir")