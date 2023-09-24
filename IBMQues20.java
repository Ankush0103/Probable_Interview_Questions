/*
Absolute differnce of sum of diagnols of matrix
 */
import java.util.*;
public class IBMQues20 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int n = mat.length;
        int sd = 0;
        int pd = 0;
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                if(i==j)
                    pd += mat[i][j];
                if((i+j)==n-1)
                    sd += mat[i][j];
            }
        }
        System.out.println(Math.abs(pd-sd));
    }
}
