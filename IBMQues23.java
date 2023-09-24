/*
n1 = 1 // First line contain 1 word
n2 = 2 // Second line contain 2 word
t = 5 // total 5 lines
Output = 8 (Number of word in a line)
COnstriant - n2>n1 else invalid output
 */

import java.util.*;
public class IBMQues23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[t];
        if(n2<n1||n1<0||n2<0)
            System.out.println("Invalid Input");
        else{
            arr[0] = n1;
            arr[1] = n2;
            for(int i = 2; i<t; i++)
                arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[t-1]);
        }
    }
}
