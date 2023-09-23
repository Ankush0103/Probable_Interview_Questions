/*
A left rotation operation on an array shifts each of the array’s elements unit to the left. For example,
if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].

Given an array of integers and a number, , perform left rotations on the array.
Return the updated array to be printed as a single line of space-separated integers.

Function Description
Complete the function rotLeft in the editor below. It should return the resulting array of integers.
rotLeft has the following parameter(s):

An array of integers .
An integer , the number of rotations.

Input Format
The first line contains two space-separated integers and , the size of and the number of left rotations you must perform.

The second line contains space-separated integers a[i].

Constraints

1 <= n <= 10^5
1 <= d <= n
1 <= a[i] <= 10^8
Output Format

Print a single line of space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input
5 4
1 2 3 4 5

Sample Output
5 1 2 3 4

Explanation
When we perform d=4 left rotations, the array undergoes the following sequence of changes:

[1,2,3,4,5] → [2,3,4,5,1] → [3,4,5,1,2] → [4,5,1,2,3] → [5,1,2,3,4]

Test Case : 1

Input (stdin)

5 4
1 2 3 4 5
Expected Output

5 1 2 3 4
Test Case : 2
Input (stdin)

20 10
41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51
Expected Output

77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77
 */
import java.util.*;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rot = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int first = 0;
        for(int j = 0; j<rot; j++)
        {
            for(int i = 0; i<n; i++) {
                first = arr[0];
            }
            for(int i = 0; i<n-1; i++)
                arr[i] = arr[i+1];
            for(int i = 0; i<n; i++)
                arr[n-1] = first;

        }
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
