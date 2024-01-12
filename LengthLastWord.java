/*
Length of Last Word
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */
import java.util.*;
public class LengthLastWord {
//    public static int lengthOfLastWord(String s) {
//        s = s.trim();
//        int op = 0;
//        for(int i = s.length() - 1; i>=0; i--)
//        {
//            if(s.charAt(i) == ' ')
//                break;
//            op++;
//        }
//        return op;

//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //System.out.println(lengthOfLastWord(s));
        String[] str = s.split(" ");
        //String s1 = str[s.length()-1];
        int count = 0;
        for(String s1:str)
        {
            for(int i = s1.length()-1; i>=0; i--)
            {
                   count++;
                   if(s1.charAt(i)== ' ')
                       break;
            }
        }
        System.out.println(count);
    }
}
