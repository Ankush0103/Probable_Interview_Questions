import java.io.*;
import java.util.*;

class Distinct_Arr {

    static void printDistinct(int arr[], int n)
    {
        // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            int flag = 0;
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < n; j++)
                if (arr[i] == arr[j]&&i!=j)
                    flag = 1;

            // If not printed earlier,
            // then print it
            if (flag == 0)
                System.out.print( arr[i] + " ");
        }
    }

    // Driver program
    public static void main (String[] args)
    {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;

        printDistinct(arr, n);

    }
}