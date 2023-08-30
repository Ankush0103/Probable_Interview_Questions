/*
number be expressed as a sum of two prime numbers
 */

// Work to be done
import java.util.*;
public class SumnPrime {
    public static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        for(int i = 2; i<=n/2; i++)
        {
            if(n%i!=0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=n/2; i++)
        {
            if(isPrime(i)==true)
            {
                if(isPrime(n-i)==true)
                    System.out.println("Number " + n + " can be denoted as " + i  + " " + (n-i));
                else
                    System.out.println("False");
            }
        }
    }
}
