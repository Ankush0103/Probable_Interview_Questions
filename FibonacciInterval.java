import java.util.*;
public class FibonacciInterval {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;
        int num3 = 0;
        int num1 = start;
        int num2 = start + 1;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for(int i = start; i<=end; i++)
        {
            num3 =  num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }

    }
}
