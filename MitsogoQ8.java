/*
Question 6: Buying Stocks
You are given a list of daily prices of a stock. You can buy a stock on one day and sell it later on another day after the day
you bought the stock. You can perform the above operation only once. What is the maximum loss possible?

Example
Prices=[10,4,2,9]
The greatest loss is incurred when you buy at a price of 10 and sell at a price of 2. Return the difference:8.
Example
Price=[1,2,3,4]
The Price went up every day. Return 0.
Sample Input for Custom Testing
STDIN                   Function
   7   → Prices []  size n=7
   1 →       prices =[1,8,4,2,10,3,2]
   8
   4
   2
  10
   3
   2
Sample Output
 8
Explanation
Using zero-based index notation, the correct answer is a[4]-a[6]=10-2=8. There is a greater difference between 10 and 1
but that would imply selling before buying, and short selling is not allowed in this problem.
 */
import java.util.*;
public class MitsogoQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int ans = 0;

        for(int i = 0; i<n; i++)
        {
            int sub = 0;
            for(int j = i + 1; j<n; j++)
            {
                    if(arr[i]>arr[j])
                    {
                        sub = arr[i] - arr[j];
                        ans = Math.max(sub, ans);
                    }
            }
        }
        System.out.println(ans);
    }
}
