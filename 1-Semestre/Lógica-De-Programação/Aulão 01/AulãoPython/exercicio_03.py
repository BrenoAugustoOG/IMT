# 3. Pedir para o usuário digitar uma palavra e procurar ela numa lista já criada previamente. Essa busca deve ter um contador, caso essa palavra seja encontrada na lista mais de uma vez. Caso a palavra não seja encontrada, não esqueça de passar uma saída informando isso.

palavra_usuario = str(input('Digite aqui a palavra que deseja procurar na lista: \n'))  

lista = ['pedro', 'breno', 'loiro', 'cabelo', 'pedreiro', 'python']

contador = lista.count(palavra_usuario)

if contador > 0:
    print(contador)

else:
    print('A palavra não foi encontrada na lista')