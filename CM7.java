
/*
Array pairs divisible by k
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
 */

import java.util.*;
// Given code not working for example 1 only.
public class CM7 {
    public static boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int flag = 0;
        int m = 0;
        int l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++)
        {
            for(int j = i + 1; j<n; j++)
            {
                if((arr[i]+arr[j])%k==0)
                {
                    flag = 1;
                    map.put(i, j);
                }
            }
        }
        if(flag==1&&map.size()==n/2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
//        canArrange(arr, k);
        System.out.println(canArrange(arr, k));
    }
}
