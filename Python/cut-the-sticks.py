def cutTheSticks(arr):
    arr.sort()
    ans = []
    while arr:
        ans.append(len(arr))
        cut = arr[0]
        arr = [x for x in arr if x > cut]
    return ans