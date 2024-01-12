/*
1, 1, 2, 2, 4, 4, 8, 8, 16, 16,......
Find n'th term of series;

 */
import java.util.*;
public class TCSQ34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = (double) n;
        double s = 2;
        double p1 = (n-1)/2;
        double p2 = n/2 - 1;
        double ans = 1;
        int ans1 = 1;
        if(n%2!=0) {
            ans = Math.pow(s, p1);
            ans1 = (int) ans;
        }
        else {
            ans = Math.pow(s, p2);
            ans1 = (int) ans;
        }
        System.out.println(ans1);
    }
}
