/*
Count number of elements of array whose number of elements to the left are smaller
 Input- arr = {2, 4, 5, 6}
 Output - 4
 Input - arr = {3, 3, 3, 3, 3, 3}
 Output - 1
 */
import java.util.*;
public class TCSQ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            int flag = 0;
            for(int j = i + 1; j<n; j++)
            {
                if(arr[j]<=arr[i])
                    flag = 1;
            }
            if(flag==0)
                count++;
        }
        System.out.println(count);
    }
}
