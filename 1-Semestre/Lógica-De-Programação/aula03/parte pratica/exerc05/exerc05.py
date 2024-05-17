idade = int(input("Nos fale a sua idade, por favor: "))

if idade < 5:
    print("Você não tem a idade necessária para competir")

elif idade >=5 and idade<=7: #5<=idade<=7
    print("Você é da categoria Infantil A")

elif idade >= 8 and idade <= 10: #8<=idade<=10
    print("Você é da categoria Infantil B")

elif idade >= 11 and idade <= 13: #11<=idade<=13
    print("Você é da categoria Juvenil A")

elif idade >= 14 and idade <= 17: #14<=idade<=17
    print("Você é da categoria Juvenil B")

elif idade >= 18: 
    print("Você é da categoria adulta!")