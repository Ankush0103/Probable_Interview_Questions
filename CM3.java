/*
String s = "**#", Output - +1;
String s = "*##", Output - -1;
String s = "**##", Output - 0;
 */
import java.util.*;
public class CM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int star = 0;
        int hash = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='*')
                star++;
            if(s.charAt(i)=='#')
                hash++;
        }
        if(star>hash)
            System.out.println(1);
        else if (star<hash) {
            System.out.println(-1);
        }
        else
            System.out.println(0);
    }
}
