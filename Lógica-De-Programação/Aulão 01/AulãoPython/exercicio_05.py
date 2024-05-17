# 5. Verificar se um número é primo: Implemente um programa que verifique se um número é primo, ou seja, se é divisível apenas por 1 e por ele mesmo.
numero_digitado = int(input('Digite aqui o número que você deseja verificar se é primo: '))

if numero_digitado <= 1:
    print('Esse número não é primo')
else:
    for i in range(2, numero_digitado):
        print(f'{numero_digitado} é primo!')
        break