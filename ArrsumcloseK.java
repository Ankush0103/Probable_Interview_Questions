/*
Input: int n = 5;
int[] arr = {5, 9, 12, 23, 31};
k = 32 (sum)
Output: Yes (9, 23)

Input: int n = 6;
int[] arr = {1, 2, 3, 4, 5, 6};
k = 15 (sum)
Output: Index 4 and 5
 */
import java.util.*;
public class ArrsumcloseK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int flag = 0;
        int idx1 = 0;
        int idx2 = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                sum = arr[i] + arr[j];
                int absdiff = Math.abs(sum - k);
                //min = Math.min(absdiff, min))
                if(absdiff<=min)
                {
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        System.out.println("Indexes close to sum are " + idx1 + " and " + idx2);
        /*if(flag==1)
            System.out.println("Yes and pairs are at index " + idx1 + " and " + idx2);
        else
            System.out.println("No");*/
    }
}
