/*
Input: 4
       2 -9 5 2
Output: 7(Minimum 7 require d to start playing if person does not want to enter credit situation)

 */
import java.util.*;
public class CiscoQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int sum = 0; int ans = 0;
        for(int i = 0; i<n; i++)
        {
            sum+=arr[i];
            if(sum<0)
            {
                sum = -sum;//Make sum positive
                ans+=sum;
                sum = 0;
            }
        }
        System.out.println(ans);
    }
}
