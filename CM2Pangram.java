/*
String that contains all aphabet letters.
 */
import java.util.*;
public class CM2Pangram {
    public static void main(String[] args) {
        String[] str = {"bit", "scale"};
        String[] str1 = {"abcdefghijklm", "tsrqpon", "uvwxyz"};
        Set<Character> s = new HashSet<>();
        Set<Character> s1 = new HashSet<>();
        for(int i = 0; i<str.length; i++)
        {
            for(char ch : str[i].toCharArray())
            {
                s.add(ch);
            }
        }
        for(int j = 0; j<str1.length; j++)
        {
            for(char ch1 : str1[j].toCharArray())
            {
                s1.add(ch1);
            }
        }
        if(s.size()==26)
            System.out.println("First array is pangram");
        else
            System.out.println("First array not pangram");
        if(s1.size()==26)
            System.out.println("Second array is pangram");
        else
            System.out.println("Second array not pangram");
    }
}
