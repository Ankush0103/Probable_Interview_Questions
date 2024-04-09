import java.util.Scanner;

/*
Question 3: Amusement park
Problem Statement – Akshay loves to go to WONDERLA , an amusement park. They are offering students who can code well with some discount.
Our task is to reduce the cost of the ticket as low as possible.
The cost of tickets can be removed by removing the digits from the price given. They will give some k turns to remove the digits
from the price of the ticket. Your task is to help Akshay in coding a program that can help him to reduce the cost of a ticket by
removing the digits from its price and getting the maximum possible discount.
Note – You cannot make the cost of a ticket zero. For eg -: If the cost of a ticket is 100, and you have 2 turns to reduce the price,
the final price will be 1 and not zero.
Constraints:
1 <= number of tickets <= 10^5
1 <= K < Number of digits in Price of ticket
Input Format for Custom Testing:
The first line contains a string,Tickets, denoting the given cost of each ticket.
The next line contains an integer, K, denoting the number of tickets that is to be removed.
Sample Cases:
Sample Input 1
203
2
Sample Output 1
0
 */
import java.util.*;
public class MitsogoQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int n1 = ch.length;
        String s1 = "";
        for(int i = 0; i< ch.length; i++)
            s1+=ch[i];
        String ans = "0";
        if(k>ch.length)
            ans = "0";
        else
        {
            ans = s1.substring(0,n1-k);
        }
        if(ans.length()>1)
            ans=ans.replace("0", "");
        System.out.println(ans);
    }
}
