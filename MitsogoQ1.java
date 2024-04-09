import java.util.Scanner;

/*
Question 1: Maximum Toys
In a toy shop there are a number of toys presented with several various – priced toys in a specific order.
You have a limited budget and would like to select the greatest number of consecutive toys that fit within the budget.
Given prices of the toys and your budget, what is the maximum number of toys that can be purchased for your child?
Example:
prices=[1,4,5,3,2,1,6]
money=6
All sub arrays that sum to less than or equal to 6 .
length 1:  [1] [4] [5] [3] [2] [1] [6]
length 2:  [1,4] [3,2] [2,1]
length 3: [3,2,1]

The longest of these or the maximum number of toys that can be purchased is 3.

Function description

Complete the function getMaxToys in the editor below

getMaxToys has the following parameters:

int prices[n] : the prices of the various toys

int money: the amount of money you can spend on toys

Returns

Int the maximum number of toys you can purchase

Constraints

1<=n<=10^5
1<=price[i]<=100
1<=money<=10^6

Sample case

Sample input 0

7->n=7
1-> price[]=[1,4,5,3,2,1,6]
4
5
3
2
1
6
6 ->money
Sample Output
2
 */
public class MitsogoQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i<n; i++)
        {
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            int sum = 0;
            int count = 0;
            for(int j = 0; j<=i; j++)
            {
                if(sum+prices[j]<=money)
                {
                    sum = sum + prices[j];
                    count++;
                    max = Math.max(count, max);
                }
                else
                {
                    count = 0;
                    sum = 0;
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
