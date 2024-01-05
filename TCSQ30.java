/*
Write a program to find smallest integer value 'b' for given value 'a'. If we multiply digits of 'b' we get exact value of 'a'.
Result b contain more than 1 digit.
Input - 10
Output - 25
Explaination - 2*5 = 10 (25 is smallest value for 10)
Input - 56
Output - 78
Explaination - 7*8 = 56 (78 is smallest value for 56)
Input - 13
Output - No result
 */
import java.util.*;
public class TCSQ30 {
    public static boolean isPrime(int n)
    {
        boolean flag = true;
        if(n==2)
            return flag;
        if(n==1)
            flag = false;
        if(n>2)
        {
            for(int i = 2; i<=n/2; i++)
            {
                if(n%i==0)
                    flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tens = 0;
        int ones = 0;
        if(isPrime(a))
            System.out.println("No result");
        // Valid for only 2 digit number.
        else
        {
            for(int i = 1; i<=9; i++)
            {
                for(int j = i + 1; j<=9; j++)
                {
                    if(i*j==a)
                    {
                        tens = i;
                        ones = j;
                        break;
                    }
                }
            }
        }
        System.out.println(10*tens + ones);
    }
}
