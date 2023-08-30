/*
 Number of integers which has exactly x divisors using java
 n = 7, x = 2
 in range 7 only 2, 3, 5, 7 have 2 divisors.
 */
import java.util.*;
public class Intxdivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=n; i++)
        {
            int c = 0;
            for(int j = 1; j<=i; j++)
            {
                if(i%j==0)
                    c+=1;
            }
            if(c==x)
                count+=1;
        }
        System.out.println(count);
    }
}
