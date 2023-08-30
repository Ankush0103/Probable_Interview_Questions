/*
Input: int[] arr = {3, 4, 1, 7, 9};
Output: even - 3, 1, 9 || odd - 4, 7. Sum of Max of both 9
 */
import java.util.*;
class EvenOddarr {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7, 9};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);
        for(int i = 1; i<arr.length; i++)
        {
            if(i%2==0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even.get(even.size()-1) + odd.get(odd.size()-1));
    }
}
