def angryProfessor(k, a):
    count = 0
    for num in a:
        if num <= 0:
            count+=1
    return "YES" if count < k else "NO"