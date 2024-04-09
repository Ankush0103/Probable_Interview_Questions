/*
Lower Triangular Matric
Input - 1 2 3
        4 5 6
        7 8 9
Output - 1 0 0
         4 5 0
         7 8 9
 */
import java.util.*;
public class LowTriMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
                mat[i][j] = sc.nextInt();
        }
        for(int i = 0; i<r; i++)
        {
            for(int j = i+1; j<c; j++)
                mat[i][j] = 0;
        }
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            if(i!=c-1)
                System.out.print(",");
        }
    }
}
