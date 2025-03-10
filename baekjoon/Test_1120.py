a,b = input().split()
min_cnt = 2147000000
for j in range(len(b)-len(a)+1):
    cnt=0
    for i in range(len(a)):
        if b[j+i]!=a[i]:
            cnt+=1
    if cnt<min_cnt:
        min_cnt = cnt

print(min_cnt)