/*
// Not solved


Today you decided to go to the gym. You currently have energy equal to E units. There are N exercises in the gym.
Each of these exercises drains Ai amount of energy from your body.

You feel tired if your energy reaches 0 or below. Calculate the minimum number of exercises you have to perform such that you become tired.
Every unique exercise can only be performed at most 2 times as others also have to use the machines.

If performing all the exercises does not make you feel tired, return -1.

Input Format
E :: INTEGER
The first line contains an integer, E, denoting the Energy.
E :: 1 -> 10^5

N :: INTEGER
The next line contains an integer, N, denoting the number of exercises. N :: 1 -> 10^5

A :: INTEGER ARRAY
Each line i of the N subsequent lines (where 0 ≤ i < N) contains an integer describing the amount of energy drained by i-th exercise.
A[i] :: 1 -> 10^5

Sample Input 1:
6
2
1
2

Sample Output 1 :
4

Sample input 2:
10
2
1
2

Sample Output 2:
-1

Sample input 3:
2
3
1
5
2

Sample Output 3:
1
 */
import java.util.*;
public class InfosysQ4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int energy = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+=2*arr[i];
        }
        if(sum<energy)
            System.out.println("-1");

        for(int i = 0; i<n; i++){
            if(arr[i]==energy)
                System.out.println("1");
        }
        /*for(int i = 0; i<n; i++)
        {
            for (int j = 0; j == energy; ) {
                System.out.println(j + 1);
            }
            if (2 * sum >= energy) {

                System.out.println(2 * (i + 1));
            }
        }*/

        for(int i = 0; i==energy; i++) {
            //System.out.println(i + 1);
            if (2 * sum >= energy)
                System.out.println(2 * (i + 1));
        }
    }
}
