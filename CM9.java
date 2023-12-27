/*
Odd baloons
Input-> char[] ch = {a, b, b, b, c, c, a, f, c}
output -> b Explaination (b and f both have odd ballons but b colour occurs first.
 */
import java.util.*;
public class CM9
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next ().charAt (0);
        int lower[] = new int[26];
        int upper[] = new int[26];
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] >= 'A') && (arr[i] <= 'Z'))
                upper[arr[i] - 'A']++;
            else if ((arr[i] >= 'a') && (arr[i] <= 'z'))
                lower[arr[i] - 'a']++;
        }
        boolean flag = false;
        char ch = '\0';
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] >= 'A') && (arr[i] <= 'Z'))
            {
                if (upper[arr[i] - 'A'] % 2 == 1)
                {
                    ch = (char) (arr[i]);
                    flag = true;
                    break;
                }
            }
            else if ((arr[i] >= 'a') && (arr[i] <= 'z'))
            {
                if (lower[arr[i] - 'a'] % 2 == 1)
                {
                    ch = (char) (arr[i]);
                    flag = true;
                    break;
                }

            }

        }
        if (flag == true)
            System.out.println (ch);
        else
            System.out.println ("All are even");
    }
}