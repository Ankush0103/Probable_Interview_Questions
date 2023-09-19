/*
        int[] arr = {3, 2, 1, -4, 6, 3, 1};
        int k = 3;
        Output = {2, 1, -4}
 */

// Not solved
public class Minsubarr {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, -4, 6, 3, 1};
        int k = 3;
        int n = arr.length;
        int ms = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {

            //int minsum = Integer.MAX_VALUE;
            for(int j = 0; j<k; j++)
            {
                int total = 0;
                total += arr[i];
                if(total<ms)
                {
                    ms = total;
                }
            }
        }
        System.out.println(ms);
    }
}
