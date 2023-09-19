import java.util.*;
public class ASCIISum {
    public static void main(String[] args) {
        String s = "12abAB";
        int sum = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                sum+=s.charAt(i) - '0' + 48;
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
                sum+=s.charAt(i);
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
                sum+=s.charAt(i);
        }
        System.out.println(sum);
    }
}
