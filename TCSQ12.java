/*
Supermarket Scanner
Input - 5244
Output - 160 (Explaination-> 5*2*4*4 = 160)
 */
import java.util.*;
public class TCSQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro = 1;
        while(n>0)
        {
            int rem = n%10;
            pro*=rem;
            n/=10;
        }
        System.out.println(pro);
    }
}
