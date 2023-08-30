/* Remove dublicates*/
import java.util.*;
// Java program to remove duplicates

class RemoveDup {
    static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
        int[] temp = new int[n];
        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        // Store the last element as whether it is unique or repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];
        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
        return j;
    }
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;

        n = removeDuplicates(arr, n);
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        // Hashset Method
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr)
            set.add(num);
        //System.out.println(set);
        System.out.println();
        System.out.println("Size " + set.size());
    }
}
