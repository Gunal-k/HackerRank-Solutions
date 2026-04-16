from collections import Counter

def happyLadybugs(b):
    freq = Counter(b)
    if any(freq[char] == 1 for char in freq if char != '_'):
        return "NO"
    if '_' not in b:
        for i in range(1,len(b)-1):
            if (b[i] != b[i-1] and b[i] != b[i+1]):
                return "NO"
    
    return "YES"