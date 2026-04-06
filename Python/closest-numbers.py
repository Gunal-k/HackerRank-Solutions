def closestNumbers(arr):
    arr = sorted(arr)
    ans = []
    mini = math.inf
    for i in range(len(arr)-1):
        diff = arr[i+1]-arr[i]
        if diff < mini:
            ans.clear()
            mini = diff
            
        if diff == mini:
            ans.append(arr[i])
            ans.append(arr[i+1])
        
    return ans