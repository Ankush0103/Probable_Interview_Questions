/*
N rooms having gold coins we have to pick gold coins from each room so that our sum  = k
Input - N = 10
        5 3 7 14 18 1 18 4 8 3
        K = 15
Output - 1 3
Explaination - From room 1 to room 3 i.e. 5+3+7 = 15
 */

import java.util.Scanner;

public class TCSQ2 {
    public static int[] findRooms(int N, int K, int[] coins)
    {
        int idx1 = 0, idx2 = 0, csum = 0;
        boolean flag = true;
        int[] result = {0, Integer.MAX_VALUE};
        while(idx2<N)
        {
            csum += coins[idx2];
            while(csum>K)
            {
                csum-=coins[idx1];
                idx1++;
            }
            if(csum==K&&(idx2-idx1<result[1]-result[0]))
            {
                result[0] = idx1;
                result[1] = idx2;
            }
            idx2++;
            if(result[1]==Integer.MAX_VALUE)
                flag = false;

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] coins = new int[N];
        for(int i = 0; i<N; i++)
            coins[i] = sc.nextInt();
        int K = sc.nextInt();
        int[] result = findRooms(N, K, coins);
        System.out.println("Entry: " + (result[0] + 1) + " Exit: " + (result[1] + 1) );
    }
}
