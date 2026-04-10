from collections import defaultdict

def acmTeam(topic):
    val = defaultdict(int)
    
    for i in range(len(topic)-1):
        for k in range(i+1,len(topic)):
            count = 0
            for j in range(len(topic[0])):
                if topic[i][j] == '1' or topic[k][j] == '1':
                    count +=1
            val[count] += 1
    return [max(val),val[max(val)]]