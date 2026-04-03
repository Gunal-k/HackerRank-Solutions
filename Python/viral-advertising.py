def viralAdvertising(n):
    init = 5
    tot = 0
    for i in range(n):
        like = init // 2
        tot += like
        init = like * 3
    return tot