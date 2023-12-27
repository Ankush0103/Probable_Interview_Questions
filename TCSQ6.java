/*
Problem Statement (Word is Key)
One programming language has the following keywords that cannot be used as identifiers:
break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct, type, var
Write a program to find if the given word is a keyword or not
Test cases
Case 1
Input – defer
Expected Output – defer is a keyword
Case 2
Input – While
Expected Output – while is not a keyword
 */
import java.util.*;
public class TCSQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range",
        "return", "struct", "type", "var"};
        int flag = 0;
        for(int i = 0;  i<s.length(); i++)
        {
            if(str[i].equals(s))
                flag = 1;
        }
        if(flag == 1)
            System.out.println(s + " is a keyword");
        else
            System.out.println(s + " not a keyword");
    }
}
