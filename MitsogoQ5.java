/*
Question 5: Majority Element
The majority element in an array is defined as the element that appears more than ⌊n/2⌋ times, where n is the length of the array.
In other words, it is the element that occurs most frequently and makes up more than half of the array.

Given an array of integers, the task is to find the majority element and return it. If there is no majority element, If there is no majority element, the algorithm should indicate that.

Examples:

Example 1:
Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
Output: 4
Explanation:
In the given array, the number 4 appears 5 times, which is more than half of the array size (9/2 = 4.5). Therefore, 4 is the majority element.

Example 2:
Input: [1, 2, 3, 4, 4, 4, 4]
Output: 4
Explanation:
In this case, the number 4 appears 4 times, which is more than half of the array size (7/2 = 3.5). Thus, 4 is the majority element.

Example 3:
Input: [1, 2, 3, 4, 5]
Output: -1
Explanation:
There is no majority element in this array since no number appears more than half of the array size (5/2 = 2.5).

Example 4:
Input: [2, 2, 2, 3, 3, 4, 4, 4, 4]
Output: -1
Explanation:
In this case, although the number 4 appears 4 times, it does not occur more than half of the array size (9/2 = 4.5).
Hence, there is no majority element.
 */
import java.util.*;
public class MitsogoQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int ans = -1;
        int c1 = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            int count = 0;
            for(int j = i + 1; j<n; j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>c1)
            {;
                c1 = count;
                ans = arr[i];
            }
        }
        if(c1<n/2)
            ans = -1;
        System.out.println(ans);
    }
}
