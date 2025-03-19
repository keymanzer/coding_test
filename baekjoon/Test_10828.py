'''
[백준] 10828_스택 (스택, 실버4)
https://www.acmicpc.net/problem/10828
'''

n = int(input())
stack = []

for _ in range(n):
    word = input()
    if 'push' in word:
        stack.append(int(word.split(' ')[-1]))
    elif word == 'pop':
        if stack:
            pop = stack.pop()
            print(pop)
        else:
            print(-1)
    elif word == 'size':
        print(len(stack))
    elif word == 'empty':
        if stack:
            print(0)
        else:
            print(1)
    elif word == 'top':
        if stack:
            print(stack[-1])
        else:
            print(-1)
    else:
        pass