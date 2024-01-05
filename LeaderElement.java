/*
Leader element. Number whose right side is smaller than number
Input: arr[] = {16, 17, 4, 3, 5, 2},
Output: 17, 5, 2

Input: arr[] = {1, 2, 3, 4, 5, 2},
Output: 5, 2
 */
import java.util.*;
public class LeaderElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        boolean flag = false;
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            int j;
            for(j = i + 1; j<n; j++)
            {
                if(arr[i]<=arr[j]) {
                    break;
                }
            }
            if(j==n)// Loop didn't break so it is leader element
            {
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Total leader elements " + count);
        // Method 2 - ArrayList
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n-1];
        list.add(max);
        for(int i = n - 2; i>=0; i--)
        {
            if(arr[i]>max)
            {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.println(list);
    }
}
