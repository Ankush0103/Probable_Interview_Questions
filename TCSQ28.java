/*
Clockwise rotations of array
Input -:
int n = 5;
int[] arr = {10, 20, 30, 40, 50};
int k = 2;
Output -:
40 50 10 20 30
 */
import java.util.*;
public class TCSQ28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int last = 0;
        for(int j = 0; j<k; j++)
        {
            for(int i = 0; i<n; i++)
            {
                last = arr[n-1];
            }
            for (int i = n-1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
