def circularArrayRotation(a, k, queries):
    b = a.copy()
    ans = []
    for i in range(k):
        val = b.pop(-1)
        b.insert(0,val)
    for num in queries:
        ans.append(b[num])
    return ans