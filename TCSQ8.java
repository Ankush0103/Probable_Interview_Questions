/*
Max length of word in string.
Input - String[] str = {"abc", "cdef", "da"}
Output - 4 (cdef length is 4 and it is max length in array}
 */
import java.util.*;
public class TCSQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n = sc.nextInt();
        String ans = "";
        String[] str = new String[n];
        for(int i = 0; i<n; i++)
        {
            str[i] = sc.next();
        }
        for(String s: str)
        {
            max = Math.max(max, s.length());
            if(max==s.length())
                ans = s;
        }
        System.out.println("String " + ans + " with length " + max);
    }
}
