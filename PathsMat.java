import java.util.*;
public class PathsMat {
    public static int paths(int i, int j, int n)
    {
        if(i<0||j<0||i>=n||j>=n)
            return 0;
        if(i==n-1&&j==n-1)
            return 1;
        int ways = 0;
        ways+=paths(i+1, j, n);
        ways+=paths(i, j + 1, n);
        return ways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(paths(0, 0, n));
    }
}
