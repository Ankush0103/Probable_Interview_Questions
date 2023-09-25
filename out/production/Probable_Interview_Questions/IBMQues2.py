# Input - "PPPPPP@PPP@PP$PP"
# Output - 2

def min_groups(s):
    pairs = s.split('$')
    min_length = float('inf')

    for p in pairs:
        subp = p.split('@')
        lengths = (len(sub) for sub in subp)
        min_length = min(min_length, min(lengths))
    return min_length
s = "PPPPPP@PPP@PP$PP"
res = min_groups(s)
print(f"Min ele after splitting in each pair {res}")  