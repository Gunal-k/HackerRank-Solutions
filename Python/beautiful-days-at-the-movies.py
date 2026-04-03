def beautifulDays(i, j, k):
    count = 0
    for i in range(i,j+1):
        num = i
        rev = 0
        while num > 0:
            temp = num % 10
            num = num //10
            rev = rev*10 + temp
        val = abs(rev-i)
        if val % k ==0:
            count+=1
    return count