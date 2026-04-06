def missingNumbers(arr, brr):
    freq = {}
    for num in brr:
        freq[num] = freq.get(num,0)+1
    
    for num in arr:
        if num in freq:
            freq[num] -= 1
        else:
            freq[num] = 1
    
    ans = []
    
    for key in freq.keys():
        if freq[key] >= 1:
            ans.append(key)
    
    return sorted(ans)