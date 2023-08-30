import java.util.*;
public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr = { 1, 7, 4, 3, 4, 8, 7, 1, 7 };
        int k = 7;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k)
            {
                System.out.println("Element " + arr[i]+ " at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
