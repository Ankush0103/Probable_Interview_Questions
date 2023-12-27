/*
The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by *
The second word should be changed like all consonants should be replaced by @
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them

Case 1
Input
how
are
you
Expected Output : h*wa@eYOU

Case 2
Input
how
999
you
Expected Output : h*w999YOU
 */
import java.util.*;
public class TCSQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String ns1 = "";
        String ns2 = "";
        String ns3 = "";
        for(int i = 0; i<s1.length(); i++)
        {
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||
                    s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
                ns1  = ns1 + '*';
            else
                ns1 = ns1 + s1.charAt(i);
        }
        for(int j = 0; j<s2.length(); j++)
        {
            if(s2.charAt(j)=='a'||s2.charAt(j)=='e'||s2.charAt(j)=='i'||s2.charAt(j)=='o'||s2.charAt(j)=='u'||s2.charAt(j)=='A'||
                    s2.charAt(j)=='E'||s2.charAt(j)=='I'||s2.charAt(j)=='O'||s2.charAt(j)=='U')
                ns2  = ns2 + s2.charAt(j);
            else
                ns2 = ns2 + '@';
        }
        ns3 = ns3 + s3.toUpperCase();
        System.out.println(ns1+ns2+ns3);
    }
}
