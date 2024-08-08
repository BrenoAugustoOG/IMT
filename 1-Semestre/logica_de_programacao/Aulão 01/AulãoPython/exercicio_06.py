# 6. Calcular o valor do juros compostos: Desenvolva uma função que calcule o valor final de um investimento com base em uma taxa de juros e um período de tempo.
valor_inicial = float(input('Digite aqui o valor inicial do investimento: \n'))
taxa_de_juros = float(input('Digite aqui a taxa de juros que deseja aplicar sobre o investimento inicial do cliente: \n'))
periodo_de_tempo = float(input('Digite aqui o período de tempo que o usuário deseja aplicar sobre o investimento inicial em dias: \n'))

valor_investimento_final = valor_inicial*(1+taxa_de_juros)**periodo_de_tempo

print(valor_investimento_final)