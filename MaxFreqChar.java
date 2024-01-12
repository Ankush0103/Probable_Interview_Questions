/*
Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str.
If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:
Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.
 */
import java.util.*;
public class MaxFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] freq = new int[s.length()];
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0; i<ch.length; i++)
        {
            freq[i] = 1;
            for(int j = i + 1; j<ch.length; j++)
            {
                if((ch[i]==ch[j]) && (ch[i]!=' ') && (ch[i]!='0'))
                {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char ans = ' ';
        for(int i = 0; i < freq.length; i++)
        {
            if(freq[i]>max)
            {
                max = freq[i];
                ans = ch[i];
            }
        }
        System.out.println(ans);
    }
}
