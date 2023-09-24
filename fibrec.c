#include <stdio.h>

int main() {
    // Write C code here
    int num = 5;
    printf("%d", sum(num));
    return 0;
}

int sum(int n)
{
    if(n==1)
        return 1;
    //int sum1  = sum(n-1);
    int ans = sum(n-1) + n;
}