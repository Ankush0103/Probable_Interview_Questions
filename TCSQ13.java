/*
Secret Message
Input - String s = "abcd"
        Output   = "fghi"
        String s = "word"
        Output   = "btwi"
        String s = "reply"
        Output   = "wjuqd"
 */
import java.util.*;
public class TCSQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)<='u')
                res += (char)(s.charAt(i)+5);
            else
                res += (char)(s.charAt(i)-'v'+'a');
        }
        System.out.println(res);
    }
}
