# n = 6
# ranks = [4, 3, 7, 2, 6, 1]
# Ouput - 3 (If arr[i]<arr[i-1] then count increase)

n = int(input())
ranks = list(map(int , input().split()))
count=0
prev = ranks[0]
for i in range(1, len(ranks)):
    if(ranks[i]<prev):
        count+=1
    prev = ranks[i]
print(count)