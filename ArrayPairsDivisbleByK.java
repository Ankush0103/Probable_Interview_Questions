/*
Given an array of integers arr of even length n and an integer k.
We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
Return true If you can find a way to do that or false otherwise.
Example 1:
Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
Output: true
Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).

Example 2:
Input: arr = [1,2,3,4,5,6], k = 7
Output: true
Explanation: Pairs are (1,6),(2,5) and(3,4).

Example 3:
Input: arr = [1,2,3,4,5,6], k = 10
Output: false
Explanation: You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10.

Constraints:
arr.length == n
1 <= n <= 105
n is even.
-109 <= arr[i] <= 109
1 <= k <= 105
 */

// Code not working for example 1 only.
import java.util.*;
public class ArrayPairsDivisbleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n is even
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int flag = 0;
        int m = 0;
        int l = 0;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++)
        {
            for(int j = i + 1; j<n; j++)
            {
                if((arr[i]+arr[j])%k==0)
                {
                    flag = 1;
                    arr1[m++] = i;
                    arr2[l++] = j;
                }
            }
        }
        System.out.println(m);
        System.out.println(l);
//        if(flag==1&&m==n/2&&l==n/2)
//            System.out.println(true);
//        else
//            System.out.println(false);
    }
}
