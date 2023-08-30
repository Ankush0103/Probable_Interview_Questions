import java.util.*;
class Majority_Element
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 4, 4, 3};
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
    }
}
