/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 */
import java.util.*;
public class BuyansSellStock2 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int minValue = prices[0];
        int diff = 0;
        int res = 0;
        for(int i = 1; i<n; i++)
        {
            if(prices[i-1]<prices[i])
            {
                diff = Math.max(diff, prices[i]-minValue);
            }
            else
            {
                minValue = prices[i];
                res+=diff;
                diff = 0;
            }
        }
        return res + diff;
    }
    public static void main(String[] args) {

    }
}
