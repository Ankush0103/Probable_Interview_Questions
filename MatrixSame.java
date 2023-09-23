import java.util.*;
public class MatrixSame {
    public static void main(String[] args) {
        int row = 4;
        int A[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};
        int B[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};
        int flag = 1;
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<A[0].length; j++) {
                if (A[i][j] != B[i][j])
                    flag = 0;
            }
        }
        if(flag==0)
            System.out.println("False");
        else
            System.out.println("True");
    }
}
