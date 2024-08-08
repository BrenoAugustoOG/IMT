ano = int(input("Ano: "))
div4 = ano%4 == 0
div100 = ano%100 == 0
div400 = ano%400 == 0

""" O ano é considerado bissexto se for divisível por 400 ou então se fo divisível por 4 e não divisível por 100"""
# Ou usar a # que também é válida e até melhor!

if div400 or (div4 and (not div100)):
    print ("É bissexto")
else:
    print("Não é bissexto")