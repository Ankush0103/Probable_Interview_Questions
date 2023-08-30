/*
        123454321
        1234 4321
        123   321
        12     12
        1       1
        12     21
        123   321
        1234 4321
        123454321
 */


import java.util.*;
public class Ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, y, z;
        x = n;
        y = -1;
        for(int i = 1; i<=2*n-1; i++)
        {
            // Printing ith line
            // digits in ascending order and let no. of digits be x
            for(int j = 1; j<=x; j++)
                System.out.print(j);
            // let no. of spaces be y
            for(int j = 1; j<=y; j++)
                System.out.print(' ');
            //digits in descending order
            z = i == 1 || i == 2*n - 1 ? x-1:x;
            for(int j=z; j>=1; j--)
                 System.out.println(z);
            //updating x and y
            x = i < n ? x - 1 : x + 1;
            y = i < n ? y + 2 : y - 2;

        }
    }
}
