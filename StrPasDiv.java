/*
Given a password string, find min number of division such that total number of decoded passwords are greater than length of
each decoded password.
Example: Input - s = "PLEASESAVEME", l = 12
         Output - "PSV" "LEE" "AAE"
 */

// Not Solved
import java.util.*;
public class StrPasDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "PLEASESAVEME";
        int r = 3;
        int c = 3;
        char[][] mat = new char[r][c];
        int k = 0;
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                mat[i][j] = s.charAt(k);
                k++;
            }
        }
        String ans = "";
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                ans += mat[i][j];
            }
            ans+=" ";
        }
        System.out.println(ans);
    }
}
