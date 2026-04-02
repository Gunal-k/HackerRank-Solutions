def countingValleys(steps, path):
    count = valley = 0
    for val in path:
        if val == 'U':
            count+=1
        elif val == 'D':
            if count == 0:
                valley+=1
            count-=1
    return valley