/*
Only 3 digit number when place in ascending order. Find the number at k place.
n = 4
arr={54, 102, 504, 544}
k = 2
Output =504
 */

import java.util.*;
public class IBMQues26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {54, 102, 504, 156, 1000};
        Arrays.sort(arr);
        HashSet<Integer> setl = new HashSet<>();
        //int[] arr1 = new int[100];
        for(int num: arr)
        {
            if(num>99||num<1000)
                setl.add(num);
        }
        /*for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]>99&&arr[i]<=999)
                arr1[i] = arr[i];
        }
        for(int i = 0; i< arr.length; i++)
            System.out.println(arr1[i]);
        int ans = 0;
        for(int i = 0; i<100; i++)
        {
            ans = arr1[2];
        }
        System.out.println(ans);*/
        int l = setl.size();
        String[] arr1 = setl.toArray(new String[setl.size()]);
        System.out.println(arr1[1]);
    }
}
