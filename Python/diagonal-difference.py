def diagonalDifference(arr):
    top = bottom = 0
    row = len(arr)
    col = row-1
    
    for i in range(row):
        top+= arr[i][i]
        bottom+= arr[i][col]
        col-=1
    return abs(top - bottom)