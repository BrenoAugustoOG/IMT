def max_valor(inicio,lista):
    if inicio == len(lista)-1:
        return lista[inicio]
    else:
        m = max_valor(inicio+1,lista)
        if lista[inicio] > m: return lista[inicio]
        else: return m