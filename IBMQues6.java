/*
Armstrong Number
 */
import java.util.*;
public class IBMQues6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0)
        {
            int rem = temp%10;
            sum = sum + rem*rem*rem;
            temp/=10;
        }
        if(n==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
