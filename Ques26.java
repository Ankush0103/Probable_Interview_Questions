/*
123454321
1234 4321
123   321
12     21
1       1
 */
// Don't Know.
import java.util.*;
public class Ques26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n + 1 - i; j++)
            {
                System.out.print(j);
            }
            for (int j = 3; j <= 2 * i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = n+1-i; j >= 1; j--)
            {
                if (i == 1 && j == n)
                {
                    continue;
                }
                System.out.print(j);
            }
                System.out.println();
            }
    }
}