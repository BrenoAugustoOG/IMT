N = int(input('N = '))

for i in range(N):
    x = int(input('X = '))
    if x < 0:
        cont = cont + 1

print('há', cont, 'números negativos!')