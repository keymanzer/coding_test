import sys
n = int(input())
result_list = []
for _ in range(n):
    result_list.append(sys.stdin.readline().strip())

result_list = list(set(result_list))
result_list.sort(key=lambda x : (len(x), x))

for result in result_list:
    print(result)