/*
Harshad number is a number or an integer in base
10 which is completely divisible by sum of  its digits.
 */

import java.util.*;
public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(temp>0)
        {
            int rem = temp%10;
            sum = sum + rem;
            temp = temp/10;
        }
        if(n%sum==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}
