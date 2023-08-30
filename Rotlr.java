/*
Java program for rotation of elements of array- left and right
Input:  int arr[] = { 10, 20, 30, 40, 50, 60, 70};
        int k = 3;
        Output: 40 50 60 70 10 20 30
 */
public class Rotlr {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 3;
        int[] newarr = new int[n];
        for(int i = 0; i<k; i++)
        {
            int j, first;
            first = arr[0];
            // Shifting 1 position left
            for(j = 0; j<n-1; j++)
                arr[j] = arr[j+1];
            // First element of array added to end
            arr[j] = first;
        }
        for(int i = 0; i<n; i++)
            System.out.println(arr[i]);
    }
}
