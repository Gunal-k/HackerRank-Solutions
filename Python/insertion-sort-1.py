def insertionSort1(n, arr):
    key = arr[n-1]
    for i in range(n-2,-1,-1):
        if arr[i] > key:
            arr[i+1] = arr[i]
            print(" ".join(map(str,arr)))
        else:
            arr[i+1] = key
            print(" ".join(map(str,arr)))
            return
    arr[0] = key
    print(" ".join(map(str,arr)))