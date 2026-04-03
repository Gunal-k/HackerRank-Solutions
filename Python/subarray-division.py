def birthday(s, d, m):
    count = 0
    n = len(s)
    for i in range(n-m+1): 
        total = 0
        for j in range(i,i+m):
            total += s[j]
        if total == d:
            count += 1
    return count