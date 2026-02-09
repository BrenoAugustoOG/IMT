numero = int(input("Digite um número inteiro: "))

if numero == 0:
    binario = "0"
else:
    n = numero
    binario = ""
    while n > 0:
        resto = n % 2
        binario = str(resto) + binario
        n //= 2

if numero == 0:
    hexa = "0"
else:
    n = numero
    hexa = ""
    while n > 0:
        resto = n % 16
        if resto < 10:
            hexa = str(resto) + hexa
        else:
            hexa = chr(ord('A') + (resto - 10)) + hexa
        n //= 16

print(f"O número {numero} em binário é: {binario}")
print(f"O número {numero} em hexadecimal é: {hexa}")
