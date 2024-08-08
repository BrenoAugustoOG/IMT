MedicaoVelha = float(input('Digite aqui a medição feita à 30 dias atrás: '))
MedicaoNova = float(input('Digite aqui a medição nova, feita recentemente: '))
UnidadesConsumidas = MedicaoNova + MedicaoVelha

if UnidadesConsumidas >= 0 and UnidadesConsumidas <= 100:
    ValorEletricidade = UnidadesConsumidas*0.5
    print(f'O valor da conta de eletricidade desse mês vai ser de: {ValorEletricidade}')

elif UnidadesConsumidas >= 101 and UnidadesConsumidas <= 200:
    UnidadesConsumidas = UnidadesConsumidas + 1
    ValorEletricidade = UnidadesConsumidas*50
    print(f'O valor da conta de eletricidade desse mês vai ser de: {ValorEletricidade}')

elif UnidadesConsumidas >= 201 and UnidadesConsumidas <= 300:
    UnidadesConsumidas = UnidadesConsumidas + 1.5
    ValorEletricidade = UnidadesConsumidas*150
    print(f'O valor da conta de eletricidade desse mês vai ser de: {ValorEletricidade}')

elif UnidadesConsumidas >= 300:
    UnidadesConsumidas = UnidadesConsumidas + 2
    ValorEletricidade= UnidadesConsumidas*300
    print(f'O valor da conta de eletricidade desse mês será de {ValorEletricidade}')