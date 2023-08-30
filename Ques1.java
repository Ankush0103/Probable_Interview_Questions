/*Josh went to the market to buy N apples. He found two shops, shop A and B, where
apples were being sold in lots. He can buy any number of the complete lot(s) but not loose apples. He is confused with the price
and wants you to figure out the minimum cost to buy exactly N apples. Write an algorithm for Josh to calculate the minimum cost to buy exactly
N apples.Input Format: The first line of the input consists of an integer – N, representing the total number of apples that Josh wants to buy.
The second line consists of two space-separated positive integers – M1 and P1, representing the number of apples in a lot and the
lot’s price at shop A, respectively. The third line consists of two space-separated positive integers-M2 and P2, representing
the number of apples in a lot and lot’s price at shop B, respectively.
Output Format: Print a positive integer representing the minimum price at which Josh can buy the apples.
Sample Input:
        19
        3 10
        4 15
        Sample Output:
        65*/

import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m1 = sc.nextInt();
        int p1 = sc.nextInt();
        int m2 = sc.nextInt();
        int p2 = sc.nextInt();
        int price = Integer.MAX_VALUE;
        for(int i = 0; m1*i<=n; i++)
        {
            int rem = n-m1*i;
            if(rem%m2==0)
            {
                int cost = p1*i + p2*(rem/m2);
                if(cost<price||price==-1)
                    price = cost;
            }
        }
        if(price!=1)
            System.out.println("Min price to buy " + n + " apples is " + price);
    }
}
