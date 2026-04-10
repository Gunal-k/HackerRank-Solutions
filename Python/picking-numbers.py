from collections import Counter

def pickingNumbers(a):
    freq = Counter(a)
    max_num = 0
    
    for num in freq:
        current = freq[num] + freq.get(num + 1, 0)
        max_num = max(max_num, current)
    return max_num