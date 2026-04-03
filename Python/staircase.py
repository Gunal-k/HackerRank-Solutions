def staircase(n):
    for i in range(n):
        for j in range(n-i-1):
            print(" ",end="")
        for j in range(i+1):
            print("#",end="")
        print()

#elegant

def staircase(n):
    for i in range(n):
        print(' ' * (n-i-1) + '#' * (i+1))