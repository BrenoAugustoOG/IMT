import math
long1 = math.radians(-46.5768199)
lat1 = math.radians(-23.647955)

long2 = math.radians(-46.6122539)
lat2 = math.radians(-23.585578)

raio = (6356.752 + 6378.137 + 6399.594 + 6335.439)/4

a = math.sin((lat2-lat1)/2)**2
b = math.sin((long2-long1)/2)**2
c = math.sqrt(a + math.cos(lat1)*math.cos(lat2)*b)
distancia = 2*raio*math.asin(c)
print(distancia)
