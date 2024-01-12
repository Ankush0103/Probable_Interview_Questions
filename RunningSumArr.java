/*
// Running Sum of 1D array

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */

import java.util.*;
public class RunningSumArr {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i = 1; i<n; i++)
        {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(runningSum(nums));
    }
}
