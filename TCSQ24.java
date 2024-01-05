/*
Series
1 1 2 3 4 9 8 27 16 81 32 243 64 729 128 2187
Find nthe term of series
 */
import java.util.*;
public class TCSQ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = 1;
        double b = 1;
        double s = 2;
        double s1 = 3;
        double p = (n-1)/2;
        double p1 = n/2 - 1;
        if(n%2!=0)
        {
            a = Math.pow(s, p);
        }
        else
        {
            b = Math.pow(s1, p1);
        }
        if(n%2==0)
            System.out.println(n + "th term is " + b);
        else
            System.out.println(n + "th term is " + a);
    }
}
