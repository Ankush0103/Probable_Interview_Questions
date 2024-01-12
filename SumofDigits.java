import java.util.*;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int so = 0;
        int se = 0;
        while(n>0)
        {
            int rem = n%10;
            if(rem%2==0)
                se+=rem;
            else
                so+=rem;
            n = n/10;
        }
        System.out.println(so);
        System.out.println(se);
        System.out.println(so+se);
    }
}
