# 5 - 101 , s = 2  -> 2 lsb cancelled and it gives 1 as binary 

# num = 5
# arr = [1, 2, 3, 4, 5]
# spikes = 2
# Output - [0, 0, 0, 1, 1]

n = int(input())
arr = list(map(int, input().split()))
s = int(input())

def ap_virus(val, s):
    return val >> s

final = []
for val in arr:
    final.append(ap_virus(val, s))

print(*final)