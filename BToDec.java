/*
 A Decimal number can be calculated by multiplying every digits of binary number with
 2 to the power of the integers starts from 0 to n-1 where n refers as the total number
 of digits present in a binary number and finally add all of them.
 */

import java.util.*;
public class BToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec = 0; //store decimal
        int n = 0; //stores power
        while(bin>0)
        {
            int temp = bin%10;
            dec += temp*Math.pow(2, n); // dec += Math.pow(8, n), in case of octal to decimal
            bin = bin/10;
            n++;
        }
        System.out.println("Decimal: " + dec);
    }
}
