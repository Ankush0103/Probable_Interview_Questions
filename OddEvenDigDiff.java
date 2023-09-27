/*
    Even position - odd position
 */
import java.util.*;
public class OddEvenDigDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        char[] str = s.toCharArray();
        int even = 0;
        int odd = 0;
        for(int i = 0; i<str.length; i++)
        {
            if((i+1)%2==0)
                even+=str[i]-48;
            else
                odd+=str[i]-48;
        }
        System.out.println(Math.abs(even-odd));
    }
}
