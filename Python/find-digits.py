def findDigits(n):
    val = str(n)
    count = 0
    for char in val:
        num = int(char)
        if (num != 0) and (n % num == 0):
            count+=1
    return count