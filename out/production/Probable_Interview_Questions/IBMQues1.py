# ASCII Reverse Order to print correct passowrd
# Input-'796115110113721110141108'
# Output - PrepInsta
 
s = "796115110113721110141108"
s = s[::-1]
print(s)
i = 0
res = ""
while(i<len(s)-1):
    x = s[i] + s[i+1]
    if x == "32":
        res = res + " "
    elif int(x) in range(65, 91) or int(x) in range(97, 123):
        res = res + chr(int(x))
    elif i+2<len(s):
        x = x + s[i+2]
        res = res + chr(int(x))
        i+=1
    i+=2
print(res)
