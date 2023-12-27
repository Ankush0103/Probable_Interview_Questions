/*
Parking Lot matrix having 0 and 1 as matrix number
Input - r = 3, c = 3
[0 1 0 1 1 0 1 1 1]
Output - 3. 3rd row have max 1
Input - r = 4, c = 3
[0 1 0 1 1 0 1 0 1 1 1 1]
Output - 4. 4th row have max 1
 */
import java.util.*;
public class CM4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int max = 0;
        int count = 0;
        int row = 0;
        for(int i = 0; i<r; i++) //r = mat.length;
        {
            for(int j = 0; j<c; j++) //c = mat[0].length
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<r; i++) //r = mat.length;
        {
            for(int j = 0; j<c; j++) //c = mat[0].length
            {
                if(mat[i][j]==1){
                    count++;
                }
                if(count>max) {
                    max = count;
                    row = i + 1;
                }
            }
        }
        System.out.println(row);
    }
}
