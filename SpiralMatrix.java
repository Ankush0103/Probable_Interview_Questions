import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat =   {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int r = mat.length;
        int c = mat[0].length;
        /*for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
                System.out.print(mat[i][j]);
        }*/
        int rs = 0;
        int re = r - 1;
        int cs = 0;
        int ce = c - 1;
        while(rs<=re && cs<=ce)
        {
            for(int i = cs; i<=ce; i++)
                System.out.print(mat[rs][i]+ " ");
            rs = rs + 1;
            for(int i = rs; i<=re; i++)
                System.out.print(mat[i][ce]+" ");
            ce = ce - 1;
            if(rs<=re)
            {
                for(int i = ce; i >= cs; i--)
                    System.out.print(mat[re][i]+" ");
                re = re - 1;
            }
            if(cs<=ce)
            {
                for(int i = re; i >= rs; i--)
                    System.out.print(mat[ce][i]+" ");
                cs = cs + 1;
            }
        }
    }
}
