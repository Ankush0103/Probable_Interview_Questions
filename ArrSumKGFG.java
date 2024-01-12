/*
For Input:
24 108
4 4 9 20 21 25 28 29 33 39 59 62 66 74 79 80 81 82 91 92 93 97 98 100
Your Code's output is:
29 79
It's Correct output is:
28 80
 */
import java.util.*;
public class ArrSumKGFG {
//    public static int[] sumClosest(int[] arr, int x) {
//        // code here
//        int n = arr.length;
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        int val1 = 0;
//        int val2 = 0;
//        Arrays.sort(arr);
//        for(int i = 0; i<n-1; i++)
//        {
//            for(int j = i + 1; j<n; j++)
//            {
//                sum =arr[i]+arr[j];
//                if(Math.abs(sum-x)<=min)
//                {
//                    min = Math.abs(sum-x);
//                    val1 = arr[i];
//                    val2 = arr[j];
//                    // if(val2>arr[j])
//                    //     val2 = arr[j];
//                }
//            }
//        }
//
//        return new int[] {val1, val2};
//    }
    public static void main(String[] args) {
        int n = 24;
        int x = 108;
        int[] arr = {4, 4, 9, 20, 21, 25, 28, 29, 33, 39, 59, 62, 66, 74, 79, 80, 81, 82, 91, 92, 93, 97, 98, 100};
        //System.out.println((sumClosest(arr, x)));
        //int n = arr.length;
        int sum = 0;
        int min = 2;
//        int[] val1 = new int[arr.length];
//        int[] val2 = new int[arr.length];
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int v1 = 0;
        int v2 = 0;
        Arrays.sort(arr);
        for(int i = 0; i<n; i++)
        {
            for(int j = i + 1; j<n; j++)
            {
                sum = arr[i]+arr[j];
                if(Math.abs(sum-x)<=min)
                {
                    min = Math.abs(sum-x);
                    set1.add(arr[i]);
                    set2.add(arr[j]);
                }
            }
        }
        System.out.println(set1);
        System.out.println(set2);
//        System.out.println(val1);
//        System.out.println(val2);
    }
}
// Output should be 28 and 80.