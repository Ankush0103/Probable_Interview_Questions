# Input 1 : 10 (Bag Size)
# Input 2 : 3 (Common Stones)
# Input 3 : [1, 6, 8]
# Remaining: [2, 3, 4, 5, 7, 9, 10]
# [2, 3, 5] and [2, 3, 4] less than 10
# len(arr) = 3
def sort_unique(M, N, common_stones):
    
    mars_weight = list(range(1, M+1))
    earth_weight = common_stones

    mars_set = set(mars_weight)
    earth_set = set(earth_weight)

    unique_mars_weight = list(mars_set - earth_set)
    unique_mars_weight.sort()

    total_weight = 0
    num_stones = 0

    for w in unique_mars_weight:
        if total_weight + w <= M:
            total_weight+=w
            num_stones += 1
        else:
            break
    return num_stones

input1 = int(input())
input2 = int(input())
input3 = list(map(int, input().split()))

output = sort_unique(input1, input2, input3)
print(output)
