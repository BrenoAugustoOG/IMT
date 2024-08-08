caracter = input('Digite aqui o caracter que deseja: ')
decimal = ord(caracter)

if decimal >= 65 and decimal <=90:
    print ("Letra maiuscula")
elif decimal >= 97 and decimal <=122:
    print('Letra Minuscula')
elif decimal >= 48 and decimal <=57:
    print('Algarismos')
elif decimal >= 0 and decimal <= 47:
    print('Caracteres Especiais')
elif decimal >= 58 and decimal <= 64:
    print('Caracteres Especiais')
elif decimal >= 91 and decimal <= 96:
    print('Caracteres Especiais')
elif decimal >=123 and decimal <= 255:
    print('Caracteres Especiais')