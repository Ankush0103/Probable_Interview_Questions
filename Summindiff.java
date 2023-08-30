/*
Java Program to find sum of minimum absolute difference of the given array
 */
public class Summindiff {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 3};
        int n = arr.length;
        int res  = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            int sum = 0;
            for(int j = 0; j<n; j++)
            {
                sum+=Math.abs(arr[i]-arr[j]);
            }
            res = Math.min(res, sum);
        }
        System.out.println(res);
    }
}
