/*
Bit toggled
Input - n = 10
Output = 5
Explaination - 10 -> 1010, Toogling 0 and 1 -> 0101==5(ans).
 */
import java.util.*;
public class TCSQ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bin = new int[255];
        int idx = 0;
        // FInding binary value
        while(n>0)
        {
            bin[idx++] = n%2;
            n = n/2;
        }
        int[] binans = new int[255];
        // Toggling '0' and '1' bits
        for(int i = idx-1; i>=0; i--)
        {
            if(bin[i]==0)
                binans[i]=1;
            if(bin[i]==1)
                binans[i]=0;
        }
        String binary = "";
        for(int i = idx - 1; i>=0; i--)
            //System.out.print(binans[i] + " ");
            binary += binans[i];
        int binaryint = Integer.parseInt(binary);
        int dec = 0;
        int p = 0;//Stores power
        // Above code can also be written as
//        while(n!=0)
//        {
//            binary = (n&1) + binary; // String binary
//            n = n>>1;
//        }
//        int binaryint = Integer.parseInt(binary);
        while(binaryint>0)
        {
            int temp = binaryint%10;
            dec += temp*Math.pow(2,p);
            binaryint/=10;
            p++;
        }
        System.out.println(dec);
    }
}
