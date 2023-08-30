/*
Find prime number between 1 and 100
 */
import java.util.*;
public class Primerange {
    public static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        else
        {
            for(int i = 2; i<n/2; i++)
            {
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 100;
        for(int i = n1; i<n2; i++)
        {
            if(isPrime(i))
                System.out.println(i + " ");
        }
    }
}
