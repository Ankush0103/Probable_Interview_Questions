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


import java.util.*;
public class Ques17 {

    public static boolean isPal(int n)
    {
        int rev = 0;
        int rem;
        int num = n;
        while(n>0)
        {
            rem = n%10;
            rev = 10*rev + rem;
            n = n/10;
        }
        if(rev==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int l = sc.nextInt();
         int u = sc.nextInt();
         for(int i = l; i<u; i++)
         {
             if(isPal(i))
                 System.out.print(i + " ");
         }
    }
}
