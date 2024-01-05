/*
Sort an array of 0's 1's and 2's
Input - n = 5, arr = {0, 2, 1, 2, 0}
Output - 0 0 1 2 2
 */
import java.util.*;
public class TCSQ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            for(int j = i + 1; j<n; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
