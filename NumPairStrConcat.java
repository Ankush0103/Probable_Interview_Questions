/*
Example 1:

Input: nums = ["777","7","77","77"], target = "7777"
Output: 4
Explanation: Valid pairs are:
- (0, 1): "777" + "7"
- (1, 0): "7" + "777"
- (2, 3): "77" + "77"
- (3, 2): "77" + "77"
Example 2:

Input: nums = ["123","4","12","34"], target = "1234"
Output: 2
Explanation: Valid pairs are:
- (0, 1): "123" + "4"
- (2, 3): "12" + "34"
Example 3:

Input: nums = ["1","1","1"], target = "11"
Output: 6
Explanation: Valid pairs are:
- (0, 1): "1" + "1"
- (1, 0): "1" + "1"
- (0, 2): "1" + "1"
- (2, 0): "1" + "1"
- (1, 2): "1" + "1"
- (2, 1): "1" + "1"
 */
import java.util.*;
public class NumPairStrConcat {
    public static void main(String[] args) {
        String[] str = {"777","7","77","77"};
        String s = "7777";
        int n = str.length;
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(i!=j)
                {
                    String s1 = str[i] + str[j];
                    if(s1.equals(s))
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
