from collections import defaultdict

def migratoryBirds(arr):
    hash_map = defaultdict(int)
    for num in arr:
        hash_map[num] +=1
        
    max_count = 0
    ans = float('inf')
        
    for bird_id, count in hash_map.items():
        if count > max_count:
            max_count = count
            ans = bird_id
        elif count == max_count:
            if bird_id < ans:
                ans = bird_id
    return ans