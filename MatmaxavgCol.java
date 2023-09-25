/*
3
95 92 89
92 90 92
90 92 90
Output = 1 (Column 1 has max average)
 */
import java.util.*;
public class MatmaxavgCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int max=0;
        int avg = 0;
        int trainee = 0;
        for(int i = 0; i<mat.length/*n(row)*/; i++)
        {
            for(int j = 0; j<mat[0].length/*n(column)*/; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<mat.length/*n(row)*/; i++)
        {
            int sum = 0;
            for(int j = 0; j<mat[0].length/*n(column)*/; j++)
            {
                sum+=mat[j][i];
                avg = sum/mat[0].length; // mat[0].length = 3(column)

            }
            if(avg>max)
            {
                max = avg;
                trainee = i+1;
            }
        }
        System.out.println(trainee);
    }
}
