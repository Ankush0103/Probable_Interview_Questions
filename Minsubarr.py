arr = [3, 2, 1, -4, 6, 3, 1]
k = 3
min_sum = float('inf')
min_sub = []
for i in range(len(arr)-k+1):
    sub = arr[i:i+k]
    curr_sum = sum(sub)
    if(curr_sum<min_sum):
        min_sum = curr_sum
        min_sub = sub
print(min_sub)