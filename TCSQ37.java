/*
Given an array of integers and a sum, the task is to count all subsets of given array with sum equal to given sum.
Input :
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an
integer n denoting the size of the array. The next line contains n space separated integers forming the array. The last line contains the sum.

Output :
Count all the subsets of given array with sum equal to given sum.
NOTE: Since result can be very large, print the value modulo 109+7.

Constraints :
1<=T<=100
1<=n<=103
1<=a[i]<=103
1<=sum<=103

Example :
Input :
2 // Number of Test Cases
Test Case1
6
2 3 5 6 8 10
10
Test Case2
5
1 2 3 4 5
10

Output :
3
3
Explanation :
Testcase 1: possible subsets : (2,3,5) , (2,8) and (10)
Testcase 2: possible subsets : (1,2,3,4) , (2,3,5) and (1,4,5)
 */
import java.util.*;
public class TCSQ37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k<t; k++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++)
                arr[i] = sc.nextInt();
            for(int i = 0; i<n; i++)
            {
                for(int j = i + 1;  j<n; j++)
                {

                }
            }
        }
    }
}
