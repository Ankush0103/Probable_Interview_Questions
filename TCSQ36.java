/*
Given an array of integers where every element appears even number of times except one element which appears odd number of times,
write a program to find that odd occurring element in O(log n) time. The equal elements must appear in pairs in the array but
there cannot be more than two consecutive occurrences of an element.
For example :
3
2 3 2
It doesn't have equal elements appear in pairs

7
1 1 2 2 2 3 3
It contains three consecutive instances of an element.

5
2 2 3 1 1
It is valid and the odd occurring element present in it is 3.

Enter only valid inputs.
Sample Input :
5
2 2 3 1 1
Sample Output :
3
 */
import java.util.*;
public class TCSQ36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int r = n-1;
        int ans = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        if(arr[0]!=arr[1])
            System.out.println(arr[0]);
        else if (arr[n-1]!=arr[n-2])
            System.out.println(arr[n-1]);
        else
        {
            while(l<=r)
            {
                int m = (l+r)/2;
                int pre = m-1;
                int nxt = m+1;
                if((arr[pre]!=arr[m])&&(arr[nxt]!=arr[m])) {
                    ans = arr[m];
                    break;
                }
                else if (m%2==0) {
                    if(arr[pre]==arr[m])
                        r = m - 1;
                    else
                        l = m + 1;
                }
                else
                {
                    if(arr[pre]==arr[m])
                        l = m + 1;
                    else
                        r = m - 1;
                }
            }
        }
        System.out.println(ans);
    }
}
