import java.util.*;
public class SecondLargewithoutSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        int first = arr[0];
        int second = arr[1];
        for(int i = 1; i< arr.length; i++)
        {
            if(arr[i]>first)
            {
                second = first;
                first = arr[i];
            } else if (arr[i]>second && arr[i]!=first) {
                second = arr[i];
            }
        }
        if(second==first)
            System.out.println("No second largest element");
        else
            System.out.println("Second largest element is " + second);
    }
}
