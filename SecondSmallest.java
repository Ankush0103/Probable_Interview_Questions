import java.util.*;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 1, 2, 3};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]<min)
                min = arr[i];
        }
        int sec_sm = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]!=min && arr[i]<sec_sm)
                sec_sm = arr[i];
        }
        System.out.println(sec_sm);
    }
}
