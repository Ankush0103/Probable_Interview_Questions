/*
Row having maximum 1
R = 4, C = 3
Elements of Array = [0 1 0 1 1 0 1 0 1 1 1 1]
Output = 4, Row = 4 have max sum
 */
public class MatRowmax1 {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 0},
                       {1, 1, 0},
                       {1, 0, 1},
                       {1, 1, 1}};
        int sum = 0;
        int count = 0;
        int max = 0;
        int max_row = 0;
        boolean flag = true;
        for(int i = 0; i< mat.length; i++)
        {
            for(int j = 0; j<mat[0].length; j++)
            {
                if(mat[i][j]==1) {
                    count++;
                    flag = false;
                }
                //sum+=mat[i][j];// Sum of all 1's
            }
            if(count>max)
            {
                max = count;
                max_row = i+1;
            }
        }
        if(flag)
            System.out.println("No ones");
        System.out.println(max_row);
    }
}
