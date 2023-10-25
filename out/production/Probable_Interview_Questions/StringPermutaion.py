def fact(n):
    if(n==0 or n==1):
        return 1
    return n*fact(n-1)
s = input()
dict = {}
for i in range(len(s)):
    dict[s[i]] = dict.get(s[i], 0) + 1
permutation = fact(len(s))
for freq in dict.values():
    permutation = permutation//fact(freq)
print(permutation)