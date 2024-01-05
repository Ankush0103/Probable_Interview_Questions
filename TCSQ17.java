/*
Array Subset or not
arr1 = {1,2,3,4,5}  , arr2 = {3,4,5}
arr2 is a subset of arr1 (As, arr1 contains all the elements of arr2)
arr3 = {1,2,3,4,5}   arr4 = {1,2,9}
arr4 is not a subset of arr3 (As, arr3 do not contains all the elements of arr4).
 */
import java.util.*;
public class TCSQ17 {
    static boolean isSubset(int arr1[], int arr2[], int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }

            if (j == m)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2};

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not subset of arr1[] ");
    }
}
