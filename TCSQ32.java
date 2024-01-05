/*
Empty chocolate packets. Push empty packets at last of array.
Input - n = 8, arr = {4, 5, 0, 1, 9, 0, 5, 0}
Output - {4, 5, 1, 9, 5, 0, 0, 0}
Explaination - Push '0' to the last of array.
 */
import java.util.*;
public class TCSQ32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int count = 0;
        int[] arr1 = new int[n];
        int j = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]!=0)
                arr1[j++] = arr[i];
        }
        for(int i = 0; i<arr1.length; i++)
            System.out.print(arr1[i] + " ");
    }
}
