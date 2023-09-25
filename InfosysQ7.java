/*
Andy wants to go on a vacation to de-stress himself. Therefore he decides to take a trip to an island.
It is given that he has as many consecutive days as possible to rest, but he can only make one trip to the island.
Suppose that the days are numbered from 1 to N. Andy has M obligations in his schedule, which he has already undertaken and
which correspond to some specific days. This means that ith obligation is scheduled for day Di. Andy is willing to cancel at most
k of his obligations in order to take more holidays.

Your task is to find out the maximum days of vacation Andy can take by canceling at most K of his obligations.

Input Format

The first line contains an integer N, denoting the total number of days
The next line contains an integer M denoting the total number of obligations.
The next line contains an integer K denoting the largest number of obligations he could cancel
Each line i of the M subsequent lines (where 0<=i<=M) contains an integer describing Di.
Constraints

1<=N<=10^6
1<=M<=2*10^6
1<=K<=2*10^6
1<=D[i]<=10^6
Sample Input 1:

10
5
2
6
9
3
2
7

Sample Output 1 :

5

Explanation:

Here he could cancel his 3rd and 4th obligation which makes vacation length 5.

Sample input 2:

7
2
0
3
4

Sample Output 2:

3

Explanation:

Here he could not cancel any obligation since K=0, so the vacation length is 3.
 */
import java.util.*;
public class InfosysQ7 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int obl = sc.nextInt();
        int[] arr = new int[obl];
        int numberofcancel = sc.nextInt();
        for(int i = 0; i<obl; i++)
        {
            arr[i] = sc.nextInt();
        }*/
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int m = sc.nextInt ();
        int k = sc.nextInt ();

        int arr[] = new int[n];

        for (int i = 0; i < m; i++) arr[i] = sc.nextInt (); int ans = 0; Arrays.sort (arr); if (k > 0)
        {
            for (int i = k + 1; i <= m + 2; i++)
                ans = Math.max (ans, arr[i] - arr[i - k - 1] - 1);
        }
        else
        {
            int j = 0;
            while (arr[j] == 0)
                j++;
            int count = 0;

            for (int i = 1; i <= n; i++)
            {
                count++;
                if (j < n && (i == arr[j]))
                {
                    count = 0;
                    j++;
                }
                ans = Math.max (count, ans);

            }
        }
        System.out.println (ans);

    }
}
