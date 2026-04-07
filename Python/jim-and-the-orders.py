def jimOrders(orders):
    arr = []
    
    for i in range(len(orders)):
        time = orders[i][0] + orders[i][1]
        arr.append((time,i+1))
    
    arr.sort()
    return [customer for _, customer in arr]