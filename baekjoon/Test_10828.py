import sys

n = int(sys.stdin.readline())
stack = []

for _ in range(n):
    word = sys.stdin.readline().split()
    if word[0] == 'push':
        stack.append(word[1])
    elif word[0] == 'pop':
        if stack:
            pop = stack.pop()
            print(pop)
        else:
            print(-1)
    elif word[0] == 'size':
        print(len(stack))
    elif word[0] == 'empty':
        if stack:
            print(0)
        else:
            print(1)
    elif word[0] == 'top':
        if stack:
            print(stack[-1])
        else:
            print(-1)
    else:
        pass