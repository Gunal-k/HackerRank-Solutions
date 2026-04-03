def getMoneySpent(keyboards, drives, b):
    ans = -1
    for val in keyboards:
        for price in drives:
            temp = val + price
            if temp <= b:
                ans = max(ans,temp)
    return ans