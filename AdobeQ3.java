/*
Problem Statement  :
There are some groups of devils and they splitted into people to kill them. Devils make People to them left as their group and at
last the group with maximum length will be killed. Two types of devils are there namely “@” and “$”
People is represented as a string “P”

Input Format:
First line with the string for input

Output Format:
Number of groups that can be formed.

Constraints:
2<=Length of string<=10^9


Input string
PPPPPP@PPP@PP$PP

Output
7

Explanation
4 groups can be formed
PPPPPP@
PPP@
PP$
PP

Most people in the group lie in group 1 with 7 members.
 */
import java.util.*;
public class AdobeQ3 {
    public static void main(String[] args) {
        String s = "PPPPPP@PPP@PP$PP";
        s = s.replace("$", " ");
        s = s.replace("@", " ");
        String[] str = s.split(" ");
        int max = 0;
        for(int i = 0; i<str.length; i++)
        {
            max = Math.max(max, str[i].length());
        }
        System.out.println(max+1);
    }
}
