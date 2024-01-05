/*
Find smallest and largest digit of a number
 */
import java.util.*;
public class SmallestLargestDigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = String.valueOf(num);
        System.out.println(s);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int min = 0;
        int max = 0;
        int n = ch.length;
        String s1 = "";
        for(int i = 0; i<n; i++)
            s1+=ch[i];
        for(int i = 0; i<s1.length(); i++)
        {
            min = s.charAt(0) - 48;
            max = s.charAt(s1.length() - 1) - 48;
        }
        System.out.println(min);
        System.out.println(max);
        // Method 2 (Take another input)
        int rem = 0;
        int num1 = sc.nextInt();
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        while(num1>0)
        {
            rem = num1%10;
            max1 = Math.max(max1, rem);
            min1 = Math.min(min1, rem);
            num1 /= 10;
        }
        System.out.println("Min digit " + min1);
        System.out.println("Max digit " + max1);
    }
}
