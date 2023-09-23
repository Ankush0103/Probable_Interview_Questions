/*
Input: n =  8
       String = 'UDDDUDUU'
       OUTPUT - 1(Number of valleys formaed)
       n =  8
       String = 'DDUUUUDD'
 */

import java.util.*;
public class TCSValley
{
    public static int countVal(int n, String s)
    {
        int sea_level = 0;
        int valleys = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='U')
                sea_level+=1;
            if(s.charAt(i)=='D')
                sea_level-=1;
            if(s.charAt(i)=='U' && sea_level==0)
                valleys+=1;
        }
        return valleys;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        String s = "UDDDUDUU";
        System.out.println(countVal(n, s));
    }
}
