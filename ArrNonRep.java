import java.util.*;
public class ArrNonRep {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++)
        {
            int count = 0;
            for(int j = 0; j<n; j++)
            {
                if(arr[i]==arr[j])
                    count++;

                if(count==0)
                    set.add(arr[j]);
            }
        }
        int k = 0;
        int[] arr3 = new int[set.size()];
        for(int ele : set)
            arr3[k++] = ele;
        for(k = 0; k< arr3.length; k++)
            System.out.println(arr[k]);
    }
}
