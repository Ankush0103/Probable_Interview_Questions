import java.lang.reflect.Array;
import java.util.*;
public class StrAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String s1 = str1.replaceAll("[\\s]", "");
        String s2 = str2.replaceAll("[\\s]", "");
        if(s1.length()!=s2.length())
            System.out.println("False");

            char[] a1 = s1.toLowerCase().toCharArray();
            char[] a2 = s2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            boolean status = Arrays.equals(a1, a2);

            if(status)
                System.out.println("Valid anagram");
            else
                System.out.println("Not valid anagram");
    }
}
