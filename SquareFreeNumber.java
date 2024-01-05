/*
Square free Number
A number is said to be square-free if no prime factor divides it more than once, i.e.,the largest power of a prime factor that divides n is one.
First few square-free numbers are 1, 2, 3, 5, 6, 7, 10, 11, 13, 14, 15, 17, 19, 21, 22, 23, 26, 29, 30, 31, 33, 34, 35, 37, 38, 39, ..
Input: n = 10
Output: Yes
Explanation: 10 can be factorized as 2*5. Since no prime factor appears more than once, it is a square free number.

Input:  n = 20
Output: No
Explanation: 20 can be factorized as 2 * 2 * 5. Since prime factor appears more than once, it is not a square free number
 */
import java.util.*;
public class SquareFreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
//        if(n%2==0)
//            n = n/2;
//        if(n%2==0) // if number is again divided by 2 then the factor 2 divide it more than once
//            flag = false;
        for(int i = 2; i<=(n/2); i++)
        {
            // Check if i is prime factor
            if(n%i==0)
            {
                n = n/i;
                if(n%i==0) // if number is again divided by i then the factor i divide it more than once
                    flag = false;
            }
        }
        System.out.println(flag);
    }
}
