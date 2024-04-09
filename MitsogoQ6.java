/*
Question 7: Loki’s Mind Stone
Problem Statement  :

Loki, the God of mischief can brainwash any living person by touching him/her with his Mind stone, and has decided to break
the avengers (a warrior group) to face into each other, so that they can turn against each other and make Loki’s evil plans easier.
Now all the avengers have some amount of strength that is denoted in integers. Loki wants to brainwash the least amount of people possible,
because he is lazy. But he wants his team of avengers to win the battle. What is the number of avengers Loki will get brainwashed.

Input Format:
First line contains an integer n, denoting the number of total avengers
the next line contains n space separated integers denoting the power of each avenger.
Output Format:
One line denoting the total number of avengers brainwashed by Loki’s Mind stone.
Constraints:
2<=n<=10^6
Test case:
Sample Input:
6
9 3 1 2 4 2
Sample Output:
2
Output Specifications:
Loki can brainwash the avengers with power 9 and 3, or with 9 and 2, or with 9,4, and the rest will be losing cause cumulative power of
rest avengers is less than the brainwashed total power by Loki.
 */
import java.util.*;
public class MitsogoQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        Arrays.sort(arr);
        int sum1 = 0, count = 0;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            sum1 = sum1 + arr[i];
            sum = sum - arr[i];
            count++;
            if (sum1 > sum)
                break;
        }

        System.out.println(count);
    }
}
