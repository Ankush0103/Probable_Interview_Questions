/*
Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
 */

import java.util.*;
public class StrongNum {
    public static int factorial(int n)
    {
        int fact = 1;
        for(int i = 1; i<=n; i++)
            fact*=i;
        return fact;
    }
    public static int strong(int n)
    {
        int sum = 0;
        int temp = n;
        while(temp>0)
        {
            int rem = temp%10;
            sum += factorial(rem);
            temp/=10;
        }
        if(sum==n)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(strong(n)==1)
            System.out.println("Strong Number");
        else
            System.out.println("Not a strong Number");
    }
}
