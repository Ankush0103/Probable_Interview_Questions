/*
Last non-zero digit in factorial
 */
import java.util.*;
public class Nonzef {
    public static int factorial(int n)
    {
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        while(fact%10==0)
            fact/=10;
        System.out.println(fact%10);
    }
}
