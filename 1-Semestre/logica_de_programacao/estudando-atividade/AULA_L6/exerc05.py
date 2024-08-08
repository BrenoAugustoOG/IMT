idade = int(input('Digite aqui a idade do nadador: '))
if idade >= 5 and idade<=7:
    print('Você está apto/a a entrar na categoria Infantil A.')

elif idade >= 8 and idade <= 10:
    print('Você está apto/a a entrar na categoria Infantil B')

elif idade >= 11 and idade <= 13:
    print('Você está apto/a a entrar na categoria Juvenil A')

elif idade >= 14 and idade <= 17:
    print('Você está apto/a a entrar na categoria Juvenil B')

elif idade >= 18:
    print('Você está apto/a a entrar na categoria Adulto')
