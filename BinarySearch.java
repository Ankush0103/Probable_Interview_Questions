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
