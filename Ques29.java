/*
Example: Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
Input  : arr[] = {100, 200, 300, 400}, k = 2
Output : 700
Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
Output : 39
 */
import java.util.*;
public class Ques29 {
    public static int maxk(int[] arr, int k)
    {
        int n = arr.length;
        //k = 2;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<=n-k; i++)
        {
            int sum = 0;
            for(int j = i; j<i+k; j++)
            {
                sum+=arr[j];

            }
            if(sum>max)
                max = sum;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr =  {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxk(arr, k));
    }
}
