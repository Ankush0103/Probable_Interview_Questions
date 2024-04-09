import java.util.Scanner;

/*
Question 2: Stepping Numbers
Problem Description :
Stepping Numbers are numbers in which the adjacent digits differ by 1. For example, 123, 545, and 98 are stepping numbers,
while 321, 444, and 75 are not. The task is to find all stepping numbers in a given range [n, m].
For example
Range: [100, 500]
Stepping Numbers: 101, 121, 123, 210, 212, 232, 234, 321, 323, 343, 345
Explanation: The stepping numbers between 100 and 500 are 101, 121, 123, 210, 212, 232, 234, 321, 323, 343, and 345.
These numbers have adjacent digits that differ by 1.Write code to find out all the stepping numbers in the given range.
Input Format: First line contains two numbers N,M
Output Format: Print all the stepping numbers present in the range.
Constraints: 0 <= N < M <= 1,000,000,000
 */
import java.util.*;
public class MitsogoQ2 {
    public static boolean stepnum(int n)
    {
        int prev = -1;
        while(n>0)
        {
            int curr = n%10;
            if(prev!=-1)
            {
                if(Math.abs(curr-prev)!=1)
                    return false;
            }
            n/=10;
            prev = curr;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i<=b; i++)
        {
            if(stepnum(i))
                System.out.print(i + " ");
        }
    }
}
