import java.sql.SQLOutput;
import java.util.*;
public class ASCIITypecasting {
    public static void main(String[] args) {
        char ch = 'a';
        int num  = ch;
        System.out.println(num);
        String s = "Hello";
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
