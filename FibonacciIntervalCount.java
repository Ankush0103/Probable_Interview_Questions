import java.util.*;
public class FibonacciIntervalCount {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;
        int num3 = 0;
        int num1 = start;
        int num2 = start + 1;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        // 10 computation of count;
        int count = 2;
        for(count = 2; count<10; count++)
        {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
