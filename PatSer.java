/*
Write a program to print the pattern series like 1
                                                 12
                                                 123
                                                 1234 ..., up to n.
 */
import java.util.*;
public class PatSer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
