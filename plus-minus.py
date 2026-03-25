def plusMinus(arr):
    p = n = z =0
    size = len(arr)
    for num in arr:
        if num>0:
            p+=1
        elif num<0:
            n+=1
        else:
            z+=1

    print(f"{p/size:06f}")
    print(f"{n/size:06f}")
    print(f"{z/size:06f}")