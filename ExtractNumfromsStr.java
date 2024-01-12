/*
Given a sentence containing several words and numbers. Find the largest number among them which does not contain 9.

Example 1:
Input:
Sentence="This is alpha 5057 and 97"
Output:
5057
Explanation:
5057 is the only number that does
not have a 9.

Example 2:
Input:
Sentence="Another input 9007"
Output:
-1
Explanation:
Since there is no number that does not contain a 9,output is -1.
Your task:
You don't need to read input or print anything. Your task is to complete the function ExtractNumber() which takes a string S as
input parameter and returns the largest number that does not contain a 9. If no such number exists, return -1.
 */

/*
GFG Code -:
long ExtractNumber(String S){
        //code here

        String[] str = S.split(" ");
        long max=-1;
        for(int i=0;i<str.length;i++)
        {
            if(Character.isDigit(str[i].charAt(0)))
            //if(str[i].matches("[0-8]+"))
            {
                //max=Math.max(max, (Long.valueOf(str[i])));
                if(!str[i].contains("9"))
                {
                    max=Math.max(max, (Long.valueOf(str[i])));
                }
            }
        }
        return max;
    }
 */
import java.util.*;
public class ExtractNumfromsStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        String s2 = "";
        boolean flag = false;
        for(String s1: str)
        {
            if(s1.matches("[0-8]+")) {
                flag = true;
                s2 += s1;
            }
        }
        if(flag)
            System.out.println(s2);
        else
            System.out.println("Not present a number without 9");
        // long ans = Long.parseLong(s2);
        // if(flag)
        //     return ans;
        // else
        //     return -1L;

    }
}
