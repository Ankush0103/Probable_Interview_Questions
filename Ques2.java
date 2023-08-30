/*A futuristic company is building an autonomous car. The scientists at the company are training the car to perform Reverse parking.
To park, the car needs to be able to move in backward as well as forward direction. The car is programmed to move backwards B meters and
forwards again, say F meters, in a straight line. The car does this repeatedly until it is able to park or collides with other objects.
The car covers 1 meter in T units of time. There is a wall after distance D from cars initial position in the backward direction.
The car is currently not without defects and hence often hits the wall. The scientists are devising a strategy to prevent this from happening.
Your task is to help the scientists by providing them with exact information on amount of time available before the car hits the wall.
Input Format:

First line contains total number of test cases, denoted by N Next N lines, contain a tuple containing 4 values delimited by space F B T D, where 1. F denotes forward displacement in meters 2. B denotes backward displacement in meters 3. T denotes time taken to cover 1 meter 4. D denotes distance from Cars starting position and the wall in backward direction
Output Format:
For each test case print time taken by the Car to hit the wall
Constraints:
First move will always be in backward direction
1 <= N <= 100
backward displacement > forward displacement i.e. (B > F)
forward displacement (F) > 0
backward displacement (B) > 0
time (T) > 0
distance (D) > 0
All input values must be positive integers only

Sample Input 0

2
6 9 3 18
3 7 5 20
Sample Output 0

162
220*/

import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int f = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();
        int td = 0; // Total distance
        int tt = 0; // Total time
        /*while(td<d)
        {
            tt += b*t;   // 6 9 3 18   , 3 7 5 20
            td += b;
            if(td>=d)
                break;
            tt += f*t;
            td -= f;
        }
        System.out.println(tt);*/
        /*for(int i = 0; i<n; i++)
        {*/
            while(b<d)
            {
                td=td+b+f;

                d=d-(b-f);
            }
            td=td+d;

        //}
        System.out.println(td*t);
    }
}
