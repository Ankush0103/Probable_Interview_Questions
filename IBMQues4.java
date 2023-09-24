/*
Change decimal number to binary
 */
import java.util.*;
public class IBMQues4 {
    public static void binary(int decimal)
    {
        int[] binary = new int[40];
        int index = 0;
        /*
        Without use of array
        // loop until 0
        while (n != 0) {
            // get remainder
            rem = n % 2;
            n /= 2;
            ans += rem * i;
            i *= 10;
        }
        return ans;
         */
        while(decimal>0)
        {
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1; i>=0; i--)
            System.out.print(binary[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binary(n);
    }
}
