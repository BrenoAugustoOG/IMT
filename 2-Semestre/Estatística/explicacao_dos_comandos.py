import pandas as pd
import numpy as np
import matplotlib as plt
import seaborn as sns
# Sempre utilizar essas importações para a análise de dados

df = pd.read_csv('arquivo.csv')
df.head()
# Leitura de arquivos de dados utilizando Pandas

df.head()
df.tail()
# Exibição das primeiras e ultimas linhas do Dataframe

df.describe()
# Resumo estatísticos dos dados

df['coluna']
df[df['coluna'] > valor]
# Seleção e filtro de dados

data = {'coluna1': [1, 2], 'coluna2': [3, 4]}
df = pd.DataFrame(data)
# Criação e manipulação de DataFrames:

#Adicionar colunas: 
df['nova_coluna'] = df['coluna1'] + df['coluna2']

#Remover colunas: 
df.drop('coluna', axis=1, inplace=True)

# Operações Básicas:
df.describe()
df.mean()
df.sum()

# Cálculo de estatísticas descritivas básicas:
df.describe()
df.mean()
df.sum()