import java.util.HashSet;
/*
Remove Dupicates from array
Input - n = 5, arr = {2, 2, 3, 4, 3}
Output - {2, 3, 4}
Code using hashset
HashSet<Integer> set = new HashSet<Integer>();
for(int num : arr)
   set.add(num);
System.out.println(set);
 */

// Not valid for 0 number.
import java.util.*;
public class TCSQ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int[] ans = new int[n];
        int j = 0;
        for(int i = 0; i<n-1; i++)
        {
            if(arr[i]!=arr[i+1])
                ans[j++] = arr[i];
        }
        ans[j++] = arr[n-1];
        for(int i = 0; i<ans.length; i++)
        {
            if(ans[i]==0)
                continue;
            System.out.print(ans[i] + " ");
        }
    }
}




//            int flag = 0;
//            for(j = 0; j<n; j++)
//            {
//                if(ans[i]==ans[j]&&i!=j)
//                {
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag==0)
//                System.out.print(ans[i] + " ");

