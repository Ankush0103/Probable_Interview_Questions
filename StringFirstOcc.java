/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
import java.util.*;
public class StringFirstOcc {
    public static int strocc(String str, String s) {
        //return str.indexOf(s); // 1 Line code
        int len  = str.length();
        int l = s.length();
        if(len<l)
            return -1;
        for(int i = 0; i<=len-l; i++)
        {
            int j = 0;
            while(j<l && str.charAt(i+j)==s.charAt(j))
                j++;
            if(j==l)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "sadbutsad";
        String s = "leeto";
        System.out.println(strocc(str,s));
    }
}
