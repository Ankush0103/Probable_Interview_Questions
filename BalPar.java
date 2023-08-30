import java.util.*;
import java.lang.*;
public class BalPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "()(())";
        String s = sc.next();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        for(int i= 0; i<s.length(); i++) {
            if (s.charAt(i) == '(')
                c1++;
            if(s.charAt(i) == ')')
                c2++;
            if(s.charAt(i) == '{')
                c3++;
            if(s.charAt(i) == '}')
                c4++;
            if(s.charAt(i) == '[')
                c5++;
            if(s.charAt(i) == ']')
                c6++;
        }
        if(c1==c2 && c3==c4 && c5==c6)
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");
    }
}
