/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */
import java.util.*;
public class SubSeqStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int i = 0, j = 0;
        for(int k = 0; k<t.length(); k++)
        {
            if(i<s.length())
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    i++;
                    j++;
                }
                else
                    j++;
            }
        }
        if(i==s.length())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
