def breakingRecords(scores):
    maxi = mini = scores[0]
    max_count = min_count = 0
    
    for i in range(1,len(scores)):
        a = scores[i]
        if a > maxi:
            maxi = max(maxi,a)
            max_count +=1
        elif a < mini :
            mini = min(a,mini)
            min_count += 1
    return [max_count,min_count]