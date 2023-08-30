import java.util.*;
public class UnionArr {
    public static void union(int[] arr1, int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        int j = 0;
        for(int i = 0; i<n1; i++)
        {
            arr3[j] = arr1[i];
            j++;
        }
        for(int i = 0; i<n2; i++)
        {
            arr3[j] = arr2[i];
            j++;
        }
        Arrays.sort(arr3);
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr3)
            set.add(num);
        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7};
        union(arr1, arr2);
    }
}
