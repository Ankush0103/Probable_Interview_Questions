import java.util.*;
public class Maxsumarr {
    public static void main(String[] args) {
        int[] arr =  {-2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        int sum = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            sum+=arr[i];
            if(max<sum) {
                max = sum;
                start = s;
                end = i;
            }
            if(sum<0) {
                sum = 0;
                s = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(start);
        System.out.println(end);
    }
}
