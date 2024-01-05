/*
Searching Linear and Binary
 */
import java.util.*;
public class TCSQ21 {
    public static void main(String[] args) {
        int[] arr = {44, 2, 5, 2, 31};
        int k = 44;
//         Linear Search
        int flag = 0;
        int ans = 0;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]==k)
            {
                flag = 1;
                ans = i;
                break;
            }
        }
        if(flag==1)
            System.out.println(ans);
        else
            System.out.println(-1);
        // Binary Search (aaplied to sorted array)
        Arrays.sort(arr);
        int bflag = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(arr[mid]<k)
            {
                left = mid + 1;
            } else if (arr[mid]>k) {
                right = mid - 1;
            }
            else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
