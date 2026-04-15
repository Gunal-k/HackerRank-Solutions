def kaprekarNumbers(p, q):
    ans = []
    for i in range(p,q+1):
        sq = str(i * i)
        d = len(str(i))
        
        left = sq[:-d] if sq[:-d] else "0"
        right = sq[-d:]
        
        if int(left) + int(right) == i:
            ans.append(i)
    val = " ".join(map(str,ans)) if ans else "INVALID RANGE"
    print(val)