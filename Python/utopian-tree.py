def utopianTree(n):
    ans = 0
    for i in range(n+1):
        if i%2 ==0 :
            ans += 1
        else:
            ans *= 2
    return ans