/*
Given a sting , return the character that appears the minimum number of times in the string.
The string will contain only ascii characters, from the ranges (“a”-”z”,”A”-”Z”,0-9), and case matters .
If there is a tie in the minimum number of times a character appears in the string return the character that appears first in the string.

Input Format:
Single line with no space denoting the input string.

Output Format:
Single character denoting the least frequent character.

Constraints:
Length of string <=10^6

Sample Input:
cdadcda

Sample Output:
c

Explanation:
C and A both are with minimum frequency. So c is the answer because it comes first with less index.
 */
import java.util.*;
public class AdobeQ4 {
    public static void main(String[] args) {
        String s = "cdadcda";
        int n = s.length();
        int[] freq = new int[256];
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++)
        {
            freq[arr[i]]++;
        }
        int min = Integer.MAX_VALUE;
        int idx = 0;
        // Frequency of ifrst min index so we start from last sos that first willoverlap last.
        for(int i = 255; i>=0; i--)
        {
            if(freq[i]==0)
                continue;
            min = Math.min(min, freq[i]);
        }
        for(int i = 0; i< arr.length; i++)
        {
            if(min == freq[arr[i]]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
