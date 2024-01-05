/*
Series
0 0 2 1 4 2 6 3 8 4 10 5 12 6 14 7 16 8
to print nth number in series i.e. what is should be at index 4. Output = 4, index = 5 ,Output = 2
Print upto 10 index the above array
 */
import java.util.*;
public class TCSQ23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            if(i%2==0)
                arr[i] = i;
            else
                arr[i] = (i - 1)/2;
            System.out.print(arr[i] + " ");
        }
        // Finding nth term of series
//        int n1 = sc.nextInt();
//        if(n1%2!=0)
//            System.out.println(n1-1);
//        else {
//            n1 = n1 / 2 - 1;
//            System.out.println(n1);
//        }
    }
}
