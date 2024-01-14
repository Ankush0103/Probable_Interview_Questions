/*
Given two non-negative integers n1 and n2, where n1
For example:
Suppose n1=11 and n2=15.
There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
Example1:
Input:
11 — Vlaue of n1
15 — value of n2
Output:
4
Example 2:
Input:
101 — value of n1
200 — value of n2
Output:
72
 */
import java.util.*;
public class TCSQ46 {
    public static boolean nonrep(int i)
    {
        int c = 0;
        int cdigit = i%10;
        boolean flag = false;
        while(i>0)
        {
            int digit = i%10;
            i = i/10;
            if(cdigit==digit)
                flag = false;
            else
                flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i = n1; i<=n2; i++)
        {
           if(nonrep(i))
               System.out.print(i + " ");
        }
    }
}
