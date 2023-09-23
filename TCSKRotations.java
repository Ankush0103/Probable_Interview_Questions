/*
int[] arr = {3, 4, 5};
number of rotations, k = 2
k = 1-> {5, 3, 4}
k = 2-> {4, 5, 3} Array index at 1 and 2 is 5 and 3.
 */
public class TCSKRotations {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        int n = arr.length;
        int last = 0;
        int k = 2;
        for(int j = 0; j<k; j++) {
            for (int i = 0; i < n; i++) {
                last = arr[n - 1];
            }
            for (int i = n-1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
