/*
Program to generate Fibonacci Triangle
 */
import java.util.*;
public class IBMQues5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of Rows
        for(int i = 1; i<=n; i++)
        {
            int first = 0;
            int second = 1;
            for(int j = 1; j<=i; j++)
            {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
            System.out.println();
        }
    }
}
