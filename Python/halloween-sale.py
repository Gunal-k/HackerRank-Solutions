def howManyGames(p, d, m, s):
    count = 0
    while s >= p:
        s -= p
        count+=1
        
        p -= d
        if p<m:
            p = m
    return count