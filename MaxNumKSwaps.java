/*
Input: M = 254, K = 1
Output: 524
Explanation: Swap 5 with 2 so number becomes 524

Input: M = 254, K = 2
Output: 542
Explanation: Swap 5 with 2 so number becomes 524, Swap 4 with 2 so number becomes 542

Input: M = 68543, K = 1
Output: 86543
Explanation: Swap 8 with 6 so number becomes 86543

Input: M = 7599, K = 2
Output: 9975
Explanation: Swap 9 with 5 so number becomes 7995, Swap 9 with 7 so number becomes 9975
 */
import java.util.*;
// Java program to find maximum
// integer possible by doing
// at-most K swap operations
// on its digits.
import java.util.*;
public class MaxNumKSwaps
{
    static String max;
    static void findMaximumNum(char[] str, int k)
    {
            // Return if no swaps left
            if (k == 0)
                return;
            int n = str.length;
            // Consider every digit
            for (int i = 0; i < n - 1; i++)
            {
                // Compare it with all digits after it
                for (int j = i + 1; j < n; j++)
                {
                    // if digit at position is less than digit at position j, swap it and check for maximum
                    // number so far and recursive for remaining swaps
                    if (str[i] < str[j])
                    {
                        // swap str[i] with str[j]
                        char t = str[i];
                        str[i] = str[j];
                        str[j] = t;
                        // If current num is more than maximum so far
                        if (String.valueOf(str).compareTo(max) > 0)
                            max = String.valueOf(str);
                        // recurse of the other k - 1 swaps
                        findMaximumNum(str, k - 1);
                        // Backtrack
                        char c = str[i];
                        str[i] = str[j];
                        str[j] = c;
                    }
                }
            }
        }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        max = str;
        findMaximumNum(str.toCharArray(), k);
        System.out.print(max + "\n");
    }
}
