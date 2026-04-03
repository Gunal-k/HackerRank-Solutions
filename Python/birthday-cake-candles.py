def birthdayCakeCandles(candles):
    maxi= freq = 0
    for num in candles:
        maxi = max(num,maxi)
    for num in candles:
        if maxi == num:
            freq+=1
    return freq