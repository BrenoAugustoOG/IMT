# 7. escrever um programa que inverta uma string fornecida pelo usuário. Por exemplo, se o usuário fornecer "python", o programa deve retornar "nohtyp".
palavra_digitada = str(input('Digite aqui uma palavra que deseja inverter: \n'))
palavra_invertida = palavra_digitada[::-1]
print(palavra_invertida)