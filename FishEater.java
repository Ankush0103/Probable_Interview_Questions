/*
There is a river which flows in one direction. One day, the river has 'N' number of fishes. You are given an array 'FISHES' of
integers representing the size of 'N' fishes. The fishes are present in the river from left to right(0th index represents the size of the
leftmost fish). As the river flows from left to right so the fishes also swim from left to right. The fishes are of different sizes
and have different speeds. The larger fishes are faster than the smaller fishes. Also, larger fishes can eat smaller fishes but can't
eat fishes of the same size. Can you find the number of fishes that survive at the end of the day?
Sample Input 1:
2
5
4 2 3 1 5
3
8 1 3
Sample Output 1:
2
1
Explanation Of Sample Output 1:
In test case 1, Refer to the example in problem description.

In test case 2,

Fishes: { 8, 1, 3 }

As fish 8 is faster and bigger than fish 1, so fish 8 will eat fish 1.
        Remaining fishes: { 8, 3 }

As fish 8 is faster and bigger than fish 3, so fish 8 will eat fish 3.
        Remaining fishes: { 8 }

Here, only 1 fish is left at last.
 */
import java.util.* ;
import java.io.*;
public class FishEater{
    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        for(int i = 0; i<n; i++) {
            int s = sc.nextInt();
            int c = s;
            int[] arr = new int[s];
            for (int j = 0; j < s; j++) {
                arr[j] = sc.nextInt();
            }
            for (int k = 0; k < s; k++) {
                //for (int x = k + 1; x < s; x++)
                    if (arr[0] > arr[k])
                        c--;
            }
            count[i] = c;
        }
        for(int i = 0; i<n; i++)
            System.out.println(count[i]);
    }
}
