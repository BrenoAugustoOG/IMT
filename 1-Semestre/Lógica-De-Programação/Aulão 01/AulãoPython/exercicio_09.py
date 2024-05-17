# 9. um programa que substitua todas as ocorrências de um caractere por outro em uma string fornecida pelo usuário.

string = input("Digite a string: ")
caractere_antigo = input("Digite o caractere a ser substituído: ")
caractere_novo = input("Digite o caractere de substituição: ")

nova_string = string.replace(caractere_antigo, caractere_novo)

print('Essa é a nova string: ', nova_string)