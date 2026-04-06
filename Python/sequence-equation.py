def permutationEquation(p):
    ans = []
    for i in range(1,len(p)+1):
        ans.append(p.index(p.index(i)+1)+1)
    return ans