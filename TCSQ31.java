/*
Reduce cost of ticket as low as possible. K turns to remove cost of ticket and then 50% discount on remaining cost is answer.
Input - String s = "203"
        int k = 3;
Output - 0
Explaination - Sort String s - 023
               k = 3 so cut from ones place 3 times so, all 3, 2 and 0 cutted so s = 0;
               50%0 = 0
Input - String s = "8976"
        int k = 2;
Output - 3
Explaination - Sort String s - 6789
               k = 2 so cut from ones place 2 times so,  9 and 8 cutted so s = 67;
               Smallest of 6, 7 is 6
               50%6 = 3
 */
import java.util.*;
public class TCSQ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String s1 = "";
        for(int i = 0; i< ch.length; i++)
            s1+=ch[i];
        String s2 = "";
        double ans = 0;
        if(k>=s1.length())
            ans = 0;
        else
        {
            s2 += s1.charAt(0);
            int n1 = Integer.parseInt(s2);
            double d = (double) n1;
            ans = d/2.0;
        }
        System.out.println(ans);
    }
}
