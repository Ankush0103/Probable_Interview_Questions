/*
Input - Hello
Output -2ll1H
 */
import java.util.*;
public class VowBinRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        int c = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
                    s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                c+=1;
                ans+=c;
            }
            else
                ans+=s.charAt(i);
        }
        String sol = "";
        for(int i = ans.length()-1; i>=0; i--)
        {
            sol+=ans.charAt(i);
        }
        System.out.println(sol);
    }
}
