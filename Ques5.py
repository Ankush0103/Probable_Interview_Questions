'''You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str
is valid password else 0.
str is a valid password if it satisfies the below conditions.
 At least 4 characters
 At least one numeric digit
 At Least one Capital Letter
 Must not have space or slash (/)
 Starting character must not be a number
Assumption:
Input string will not be empty.
Example:
Input:
aA1_67
Output:
1
Sample Input:
a987 abC012
Output:
0'''

def checkPassword(str, n):
    if(n<4):
        return 0
    if(str[0].isdigit()):
        return 0
    num = 0
    cap = 0
    for i in range(n):
        if(str[i]==' ' or str[i]=='/'):
            return 0
        if(str[i]>='A' or str[i]<='Z'):
            cap+=1
        if(str[i]>='0' or str[i]<='9'):
            num+=1
    if(cap>0 and num>0):
        return 1
    else:
        return 0

str = (input())
n = len(str)
print(checkPassword(str, n))