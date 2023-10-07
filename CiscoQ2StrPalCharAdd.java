import java.util.Scanner;

/*
Additional Characters to make string palindrome.
Input: String s = "abede"
Output: "ba"
Input: String s = "abcfe"
Output: "fcba"
 */
public class CiscoQ2StrPalCharAdd {
    public static boolean isPal(String s)
    {
        String s1 = "";
        for(int i = s.length() - 1; i>=0; i--)
            s1+=s.charAt(i);
        if(s.equals(s1))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //System.out.println(isPal(s));
        String ans = "";
        if(isPal(s))
            System.out.println("String already a palindrome");
        for(int i = 0; i<s.length(); i++)
        {
            if(isPal(s.substring(i, s.length())))
            {
                ans += s.substring(0, i);
                break;
            }

            /*else
                ans+=*/
        }
        String res = "";
        for(int i = ans.length()-1; i>=0; i--)
        {
            res+=ans.charAt(i);
        }
        System.out.println(res);
    }
}
