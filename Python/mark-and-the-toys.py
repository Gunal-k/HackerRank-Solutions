def maximumToys(prices, k):
    prices.sort()
    total = count = 0
    for price in prices:
        total += price
        if total > k:
            break
        count +=1
    return count