# /*
# Find number of cells in excel sheet
# A1-C8, Output - 24
# E10-E10, Output - Both cannot be same
#  */
str = input()
p = str.split("-")

a = p[0][0]
b = p[1][0]
print(a,b)

c = p[0][1:]
d = p[1][1:]
print(c,d)

if(a==b and c==d):
    print("Invalid")
else:
    m = abs(ord(a) - ord(b)) + 1
    n = abs(int(c)-int(d)) + 1
    print(m*n)