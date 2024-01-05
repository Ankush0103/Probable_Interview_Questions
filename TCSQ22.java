/*
Second and Second smallest in an array without sorting
Input - n = 5, arr = 2 4 3 6 5
        Output - 2 3
        n = 6, arr = 1 2 1 3 6 7
        Output - 1 2
 */
import java.util.*;
public class TCSQ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println(min);
        int sec_sm = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]!=min&&arr[i]<sec_sm)
                sec_sm = arr[i];
        }
        System.out.println(sec_sm);
    }
}
