import java.util.*;
public class TCSQ49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sol = "";
        String ans = "";
        char[] cs = s.toCharArray();
        for(int i = 0; i<s.length(); i++)
        {
            sol += (char) (s.charAt(i)+1);
        }
        for(int i = 0; i<sol.length(); i++)
        {
            if(sol.charAt(i)=='!')
                ans+=" ";
            else
                ans += sol.charAt(i);
        }
        System.out.println(ans);
    }
}
