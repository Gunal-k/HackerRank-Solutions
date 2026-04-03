def countApplesAndOranges(s, t, a, b, apples, oranges):
    count_a = count_o = 0
    
    for apple in apples:
        pos = a + apple
        if pos>=s and pos <=t:
            count_a+=1
    print(count_a)
            
    for orange in oranges:
        pos = b + orange
        if pos>=s and pos <=t:
            count_o+=1
    print(count_o)