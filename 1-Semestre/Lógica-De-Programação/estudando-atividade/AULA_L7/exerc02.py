idade = int(input('Digite a idade: '))
if idade < 2:
    print('A pessoa com essa idade é considerada um bebê.')
elif idade >= 2 and idade < 4:
    print('A pessoa com essa idade é considerada uma criança de colo.')
elif idade >= 4 and idade < 13:
    print('A pessoa com essa idade é considerada uma criança.')
elif idade >= 13 and idade < 20:
    print('A pessoa com essa idade é considerada um adolescente.')
elif idade >= 20 and idade < 65:
    print('A pessoa com essa idade é considerado adulto.')
else:
    print('A pessoa com essa idade é considerada um bebê.')