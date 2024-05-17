#Criar uma lista com os elementos de uma PA que começa com 5, de razão 10, com 8 valores
#Criar uma segunda lista com os elementos de uma PG que começa em 2, de razão 5, com  5 valores.
#Faça um programa que mostre os valores em comum das listas

# Criar a lista da PA ================================================================================

# Definindo os parâmetros da PA
primeiro_termo = 5
razao = 5
num_valores = 8

# Lista para armazenar os elementos da PA
pa = []

# Gerando os elementos da PA
for i in range(num_valores):
    termo = primeiro_termo + i * razao
    pa.append(termo)

# Exibindo a lista
print(pa)

# Criar a lista da PG =============================================================================================

# Definindo os parâmetros da PG
primeiro_termo_pg = 2
razao_pg = 5
num_valores_pg = 5

# Lista para armazenar os elementos da PG
pg = []

# Gerando os elementos da PG
for i in range(num_valores_pg):
    termo_pg = primeiro_termo_pg * (razao_pg ** i)
    pg.append(termo_pg)

# Exibindo a lista
print(pg)

#Lista contendo os valores em comum ============================================================================

# Lista para armazenar os valores em comum
valores_em_comum = [] 

# Verifica cada elemento da primeira lista na segunda lista
for elemento in pa:
    if elemento in pg:
        valores_em_comum.append(elemento)

# Exibe os valores em comum
print("Valores em comum das duas listas:", valores_em_comum)
