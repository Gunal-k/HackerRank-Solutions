def getTotalX(a, b):
    count = 0
    first = max(a)
    second = max(b)
    for i in range(first,second+1):
        div = True
        for num in a:
            if i % num !=0:
                div = False
        for num in b:
            if num % i !=0:
                div = False
        if div:
            count += 1
    return count