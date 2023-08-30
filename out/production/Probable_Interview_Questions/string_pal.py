s = input()
s1 = s[::-1]
if(s==s1):
    print("True")
else:
    print("False")

# Method 2
str = input()
for i in range(0, int(len(str)/2)):
    if str[i] != str[len(str)-i-1]:
        print("False")
    else:
        print("True")