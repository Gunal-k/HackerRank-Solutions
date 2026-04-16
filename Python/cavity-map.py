def cavityMap(grid):
    n = len(grid)
    result = grid[:]

    for i in range(1, n-1):
        row = list(grid[i])
        
        for j in range(1, n-1):
            curr = grid[i][j]
            
            if (curr > grid[i-1][j] and
                curr > grid[i+1][j] and
                curr > grid[i][j-1] and
                curr > grid[i][j+1]):
                
                row[j] = 'X'
        
        result[i] = "".join(row)
    
    return result