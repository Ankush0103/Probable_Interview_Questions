import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int number = n;
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
        if(number==sum) {
            System.out.println("Armstrong Number");
            //Decode number will be sum of digit of even place
        }
        else
            System.out.println("Not Armstrong Number");
        //System.out.println(count);
    }
}
