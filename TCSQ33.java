/*
1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, ...
nth term ofseries
 */
// Not fully Solved
import java.util.*;
public class TCSQ33 {
    static int MAX = 1000;
    public static int PrimeAns(int n)
    {
        int count = 0;
        int ans = 0;
        for (int i = 2; i <= MAX; i++) {
            int flag = 0;
            for(int j = 2; j<=i/2; j++)
            {
                if(i%j==0)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                count++;
            if(count==n);
                return i;
        }
       return 0;
    }
    public static int FibonacciAns(int n)
    {
        int ans = 0;
        int num1 = 1;
        int num2 = 1;
        if(n==1||n==2)
            ans = n;
        int num3 = 0;
        for(int i = 3; i<=n; i++)
        {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            ans = num3;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0)
        {
            System.out.println(FibonacciAns(n/2+1));
        }
        else
        {
            System.out.println(PrimeAns(n/2));
        }
    }
}
