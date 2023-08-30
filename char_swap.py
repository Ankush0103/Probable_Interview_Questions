# Given a string swap all the char X with char Y.
str = input("Enter the string\n")
res = ""
c1='a'
c2='b'
for i in range(len(str)):
    if(str[i]!=c1):
        res += str[i]
    else:
        res += c2
print(res)


# def replaceCharacter(str, c1, c2):
#     n = len(str)
#     res = ""
#     for i in range(n):
#         if str[i] != c1:
#             res += str[i]
#         else:
#             res += c2
#     return res
 
# # Driver Code
# if __name__ == '__main__':
#     # Given string
#     str = "abacd"
#     c1 = 'a'
#     c2 = 'x'
 
#     # Function call
#     str = replaceCharacter(str, c1, c2)
 
#     # Print the string
#     print(str)