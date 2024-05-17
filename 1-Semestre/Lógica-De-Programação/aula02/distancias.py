def euclidiana(xa, ya, xb, yb):
    distancia = ((xb-xa)**2 + (yb-ya)**2)**0.5
    return distancia

def haversine(lat1, long1, lat2, long2):
    import math
    long1 = math.radians(long1)
    lat1 = math.radians(lat1)

    long2 = math.radians(long2)
    lat2 = math.radians(lat2)

    raio = (6356.752 + 6378.137 + 6399.594 + 6335.439)/4

    a = math.sin((lat2-lat1)/2)**2
    b = math.sin((long2-long1)/2)**2
    c = math.sqrt(a + math.cos(lat1)*math.cos(lat2)*b)
    distancia = 2*raio*math.asin(c)
    return distancia