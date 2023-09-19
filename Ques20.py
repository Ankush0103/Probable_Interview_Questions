# 1C01C0 || A - AND, B - OR, C - XOR
def Bin01(str):
    if str is None:
        return -1
    # Inintailaize reuslt
    res = int(str[0])
    for i in range(1, len(str), 2):
        opr = str[i]
        opd = int(str[i+1]) 
        if(opr=='A'):
            res = res and opd
        if(opr=='B'):
            res = res or opd
        if(opr=='C'):
            res = res ^ opd
    return res
result = Bin01('1B0A1B0C0')
print(result)