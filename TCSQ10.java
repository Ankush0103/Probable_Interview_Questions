/*
Big problem statement comprises to
Print Even occurence of array digits
Input - n = 6
        arr = {1, 2, 2, 2, 3, 1}
        Output -> 1 (It occurs 2 times)
 */
import java.util.*;
public class TCSQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = -1;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            int flag = 0;
            int count = 0;
            for(int j = i + 1; j<n; j++)
            {
                if(arr[i]==arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                continue;
            for(int j = 0; j<=i; j++)
            {
                if(arr[i]==arr[j])
                    count++;
                if(count%2==0)
                    ans = arr[i];
            }
            System.out.println(arr[i] + " : " + count);
        }
        System.out.println("Element with even occurence " + ans);
    }
}
