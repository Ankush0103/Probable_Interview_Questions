# Language
# 4g32gn1L
s = input()
a = list(s)
ans = ''
c = 0
vow = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
for i in a:
    if i in vow:
        c+=1
        ans+=str(c)
    else:
        ans+=i
print(ans[::-1])

# Typecasting in python
ch = 'a'
num = ord(ch)
print(num)