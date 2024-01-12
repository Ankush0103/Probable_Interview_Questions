/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BuyansSellStock {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        /*for(int i = 0; i<prices.length-1;i++)
        {
            for(int j = i+1; j<prices.length; j++)
            {
                int profit = prices[j] - prices[i];
                if(profit>maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit; */
        int max = Integer.MAX_VALUE;
        int profit = 0;
        int pro = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < max){
                max = prices[i];
            }
            pro = prices[i] - max;
            if(profit < pro){
                profit = pro;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
    }
}
