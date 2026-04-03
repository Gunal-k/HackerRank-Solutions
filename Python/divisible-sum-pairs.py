def divisibleSumPairs(n, k, ar):
    count = 0
    for i in range(n-1):
        for j in range(i+1,n):
            total = ar[i] + ar[j]
            if total % k == 0:
                count += 1
    return count