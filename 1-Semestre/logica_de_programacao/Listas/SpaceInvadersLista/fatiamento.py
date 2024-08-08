#criado para enteder o fatiamento
lista = [1,2,3]
print(lista[::-1]) # mostre toda lista do inicio ao fim indo para trás

lista = [1,2,3]
print(lista[:2])

lista = [1,2,3]
print(lista[::-2])

cpf = [5,4,9,0,8,3,9,7,8,3,0]
print(cpf[:9])

nome = input('Entre com o seu nome: ')
if nome == nome[::-1]:
    print('é palíndrome')
else:
    print('não é palindrome')