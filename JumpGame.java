/*
You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
import java.util.*;
public class JumpGame {
    public static boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length!=1)
            return false;
        for(int i = 1; i<nums.length; i++)
        {
            if(i==nums.length-1)
                return true;
            if(nums[i]==0)
            {
                int flag = 1;
                for(int j = i-1; j>=0; j--)
                {
                    if(nums[j]>flag)
                        break;
                    if(j==0)
                        return false;
                    flag++;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(canJump(arr));
    }
}
