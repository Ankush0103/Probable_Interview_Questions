import java.util.Scanner;

/*
Jack and Jill are playing a string game. Jack has given Jill two strings A and B. Jill has to derive a string C from A, by deleting elements from string A, such that string C does not contain any element of string B.
Jill needs help to do this task. She wants a program to do this as she is lazy. Given strings A and B as input, give string C as Output.
Example 1:
Input:
tiger     -> input string A
ti          -> input string B
Output:
ger       -> Output string C
Explanation:
After removing “t” and “i” from “tiger”, we are left with “ger”.
So, the answer is “ger”.
Python Program -:
a = input()
b = input()
c = ""
for i in a:
    if i in b:
        continue
    else:
        c += i
print(c)
 */
public class TCSQ25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = "";
        for(int i = 0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(s2.indexOf(ch)==-1)
                s3+=ch;
        }
        System.out.println(s3);
    }
}
