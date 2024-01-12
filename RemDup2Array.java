/*
// Sorted Array
Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
import java.util.*;
public class RemDup2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++)
            nums[i] = sc.nextInt();
        //int[] nums1 = new int[n];
        if(n == 1) System.out.println(n);
        int idx = 1;
        int occ = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                occ++;
            }
            else
                occ = 1;
            if(occ<=2)
            {
                nums[idx] = nums[i];
                idx++;
            }
        }
        System.out.println(idx);
    }
}
