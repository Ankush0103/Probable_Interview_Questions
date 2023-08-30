/*
 Input : arr[] = {1, 5, 15, 10} k = 3
Output : Maximum difference is 8
Explanation : After modification array become , arr[] = {4, 8, 12, 7} and maximum   height – minimum height (12-4) = 8.
 */
import java.util.*;
public class Maxminhei {
    public static int maxminh(int[] arr, int k)
    {
        int n = arr.length;

        for(int i = 0; i<n/2; i++)
            arr[i]+=k;
        for(int i = n/2; i<n; i++)
            arr[i]-=k;
        Arrays.sort(arr);
        for(int i = 0; i<n; i++)
            System.out.println(arr[i]);

        return arr[n-1] - arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 15, 10};
        int k = 3;
        System.out.println(maxminh(arr, k));
    }
}
