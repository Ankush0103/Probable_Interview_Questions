import java.util.*;
public class ArmstrongOddEvenDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int number = n;
        int numbercheck = n;
        int count = 0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        int rem = 0;
        int sum = 0;
        while(num>0)
        {
            rem=num%10;
            sum+=Math.pow(rem, count);
            num/=10;
        }
        int rev = 0;
        while(number>0)
        {
            rev = rev*10 + number%10;
            number/=10;
        }
        int evensum = 0;
        int oddsum = 0;
        int c = 1;
        while(rev>0)
        {
            if(c%2==0)
                evensum+=rev%10;
            else
                oddsum+=rev%10;
            rev/=10;
            c++;
        }
        int ans = 0;
        if(numbercheck==sum) {
            System.out.println("Armstrong Number");
            //Decode number will be sum of digit of even place
            ans = evensum;
        }
        else {
            System.out.println("Not Armstrong Number");
            ans = oddsum;
        }
        System.out.println(ans);
    }
}
