# Lexicographically previous permutation of string in descending order
# DCAB
# DACB DABC DBCA DBAC CDAB CDBA CADB CABD CBDA CBAD ADCB ADBC ACDB ACBD ABDC ABCD BDCA BDAC BCDA BCAD BADC BACD
from itertools import permutations
s = input()
per = permutations(s)
ls = []
for i in per:
    ls.append(''.join(i))
for i in ls:
    if i<s:
        print(i, end = " ")