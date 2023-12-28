/*
Biker Cross
Array of size n conatain binary digits '0' and '1'. 0-N, 1-S
Find pairs of 0 and 1.
Input - n = 5, arr = {0, 1, 0, 1, 1}
Ouput - 5
 */
import java.util.*;
public class TCSQ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        int c = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]!=0)
                sum+=c;
            else
                c++;
        }
        System.out.println(sum);
    }
}
