/*
Input: 2020
Output: Yes, also 2 distinct elements || 2020 == 2020 since 0 occur -2 times 1 occur -0 times 2 occur -2 time 3 occur -0 times
Input: 1210
Output: Yes, also 3 distinct elements || 2020 == 2020 since 0 occur -1 times 1 occur -2 times 2 occur -1 time 3 occur -0 times
Input: 72110
Output: No. 0 oocurs 1 time not 7 times/
 */
import java.util.*;
public class AutoBiggraphicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for(int i = arr.length - 1; i>=0; i--)
        {
            arr[i] = n%10;
            n = n/10;
        }
        boolean flag = true;
        for(int i = 0; i< arr.length; i++)
        {
            int count = 0;
            for(int j = 0; j< arr.length; j++)
            {
                if(i==arr[j])
                    count++;
            }
            if(count!=arr[i])
            {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("Autobiographical number");
            int count = 1;
            for (int i = 1; i < arr.length - 1; i++) {
                int j = 0;
                for(j = 0; j<i; j++)
                {
                    if(arr[i]==arr[j])
                        break;
                }
                if(i==j)
                    count++;
            }
            System.out.println(count);
        }
        else
            System.out.println("Not Autobiographical");

    }
}
