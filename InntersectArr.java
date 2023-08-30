import java.util.*;
public class InntersectArr {
    public static void intersect(int[] arr1, int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr3 = new int[n1+n2];
        int k = 0;
        for(int i = 0; i<n1; i++)
        {
            for(int j  = 0; j<n2; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr3[k++] = arr1[i];
                }
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num: arr3)
            set.add(num);
        set.remove(0);
        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6};
        intersect(arr1, arr2);
    }
}
