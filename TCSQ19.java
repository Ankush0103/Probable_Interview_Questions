/*
Frequency of limited range array elements
Input - n = 5, arr = {2, 3, 2, 3, 5}
        p = 5
        Output - 0 2 2 0 1
        Explaination - From 1 to p we have to give number of occurences.
        1 occurs 0 times, 2 occurs 2 times, 3 occurs 2 times, 4 occurs 0 times, 5 occurs 1 times.
 */
import java.util.*;
public class TCSQ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
        int p = sc.nextInt();

        for(int i = 0; i<n; i++)
        {
            int flag = 0;
            int count = 0;
            for(int j = i + 1; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
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
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
