def sockMerchant(n, ar):
    arr = defaultdict(int)
    for num in ar:
        arr[num] += 1
        
    pair = 0
    for value in arr.values():
        pair += value//2
    
    return pair