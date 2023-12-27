/*
Implement function findLostGem(int[] arr)  to find whether array is magical or not.
Input - n = 5
        int[] arr = {0, 1, 4, 9, 16}
Output - +1 i.e. magical
Output - -1 i.e. not magical.
 */
import java.util.*;
public class CM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag = 0;
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == i*i)
            {
                flag = 1;
            }
        }
        if(flag==1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
