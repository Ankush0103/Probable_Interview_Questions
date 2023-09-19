/*Count increaing number of subarraysInput: arr[] = {1, 4, 3}
Output: 1
There is only one subarray {1, 4}

Input: arr[] = {1, 2, 3, 4}
Output: 6
There are 6 subarrays {1, 2}, {1, 2, 3}, {1, 2, 3, 4}
                      {2, 3}, {2, 3, 4} and {3, 4}

Input: arr[] = {4, 2, 2, 1}
Output: 0
There are no increasing subarrays*/

import java.util.*;
public class Ques27 {
    public static int Count(int[] arr, int n){
        int c = 0;
        n = arr.length;
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(arr[j-1]<arr[j])
                    c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Count(arr, n));
    }
}
