/*Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n1, n2;
    scanf("%d %d", &n1, &n2);
    for(int i = n1; i<=n2; i++)
    {
        int rem;
        //int temp = i;
        int sum = 0;
        int n = i;
        while(n!=0)
        {
            rem = n%10;
            sum = sum*10 + rem;
            n = n/10;
        }
        if(sum==i)
            printf(" %d ", i);
    
    }
    return 0;
}