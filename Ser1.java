/*
Find the 15th term of the series?
0,0,7,6,14,12,21,18, 28
 */
import java.util.*;
public class Ser1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 6;
        int n2 = 7;
        int ans = 0;
        if(n%2==0)
        {
            int p1 = n/2 - 1;
            ans = p1*n2;
        }
        if(n%2!=0)
        {
            int p2 = (n - 1)/2;
            ans = p2*n1;
        }
        System.out.println(ans);
    }
}
