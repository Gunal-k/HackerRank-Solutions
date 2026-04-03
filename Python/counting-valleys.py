def countingValleys(steps, path):
    count = valley = 0
    for val in path:
        if val == 'U':
            count+=1
            if count == 0:
                valley+=1
        else:
            count-=1
    return valley