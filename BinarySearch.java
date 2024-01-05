/*
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l = 0;
        int r = n-1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(arr[m]==k)
                return m;
            else if(arr[m]<k)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
 */
import java.util.*;
public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr = { 1, 7, 4, 7};
        int k = 4;
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==k)
            {
                System.out.println("Element  " + k + " at " + mid);
                return;
            }
            else if(arr[mid]<k)
            {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        System.out.println("Element not found");
    }
}
