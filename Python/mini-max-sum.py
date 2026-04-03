import math

def miniMaxSum(arr):
    mini = math.inf
    maxi = 0
    sum_val = 0
    
    for num in arr:
        sum_val += num
        mini = min(mini,num)
        maxi = max(maxi,num)
        
    print(sum_val-maxi,sum_val-mini)