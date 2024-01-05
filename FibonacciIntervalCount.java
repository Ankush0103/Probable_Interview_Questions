import java.util.*;
public class FibonacciIntervalCount {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;
        int num3 = 0;
        int num1 = start;
        int num2 = start + 1;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        // 10 computation of count;
        int count = 2;
        for(count = 2; count<10; count++)
        {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
/*

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n)
    {
        //Your code here
        long arr[]= new long[n];
        arr[0] = 1;
        if(n>1){
            arr[1] = 1;

        for(int i=2; i<=n-1;i++){
                arr[i] = arr[i-1]+arr[i-2];
        }
        }
        return arr;
    }
}
*/
/*
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n)
    {
        //Your code here
        long a=1;
        long b=1;
        long c=0;

        long[]arr1=new long[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=a;
            c=a+b;
            a=b;
            b=c;
        }

        return arr1;
    }
}

 */