/*
Input - 457892
Output - OddDigsum = 20, EvenDigSum = 15
 */
import java.util.*;
public class SumOddEvenDig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int c = 1;
        int rev = 0;
        while(n>0)
        {
            rev = rev*10 + n%10;
            n/=10;
        }
        int evensum = 0;
        int oddsum = 0;
        while(rev>0)
        {
            if(c%2==0)
                evensum+=rev%10;
            else
                oddsum+=rev%10;
            rev/=10;
            c++;
        }
        System.out.println("Even index digit sum: " + evensum);
        System.out.println("Even index digit sum: " + oddsum);
    }
}
