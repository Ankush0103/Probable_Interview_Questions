/*##Given N and M, find minimum number of primes to make N, you can use first M primes to do so.
Input-> N:10, M:1
Output->5
Explaination-> Minimum we require 5 primes i.e. 2+2+2+2+2
Input-> N:11, M:3
Output->5
Explaination-> Minimum we require 5 primes i.e. 3+3+5##
Input: N = 100
Output: 2
Explanation:
100 can be written as sum of 2 prime numbers 97 and 3.

Input: N = 25
Output: 2
Explanation:
25 can be written as sum of 2 prime numbers  23 and 2.
 */
import java.util.*;
public class MinnumPrime {
    public static boolean isPrime(int n)
    {
        for(int i = 2; i<=n/2; i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static int minCount(int n)
    {
        if(isPrime(n))
            return 1;
        else if (n%2==0) {
            return 2;
        }
        else
        {
            if(isPrime(n-2))
                return 2;
            else
                return 3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minCount(n));
    }
}
