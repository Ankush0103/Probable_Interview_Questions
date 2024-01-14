/*
0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
Find 33rd term.
 */
import java.util.*;
public class Ser2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        if(n%2!=0)
        {
            int p1 = (n-1)/2;
            ans = 2*p1;
        }
        if(n%2==0)
        {
            int p2 = (n/2)-1;
            ans = 1*p2;
        }
        System.out.println(ans);
    }
}
