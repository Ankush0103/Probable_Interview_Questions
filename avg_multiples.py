# Finding average of P multiple of any number n.
n = int(input()) # Limit of Number
p = int(input()) # P multiple
m = n//p # no. of multiples
sum = ((m*(m+1))/2)*p
avg = sum/m
print(avg)

