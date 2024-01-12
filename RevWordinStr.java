/*
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
import java.util.*;
public class RevWordinStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        String s1 = "";
        for(int i = str.length-1; i>=0; i--)
        {
            s1+=str[i]+" ";
        }
        //s1+=str[0];
        System.out.println(s1);
    }
}
