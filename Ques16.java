/*You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix
in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index
will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then print the
sum of second largest number from both the matrices
        Example
        enter the size of array : 5
        enter element at 0 index : 3
        enter element at 1 index : 4
        enter element at 2 index : 1
        enter element at 3 index : 7
        enter element at 4 index : 9
        Sorted even array : 1 3 9
        Sorted odd array : 4 7

        7*/
import java.util.*;
public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        /*int[] even = new int[20];
        int[] odd = new int[20];
        int j = 0;
        int k = 0;
        for(int i = 0; i<n; i++)
        {
            if(i%2==0) {
                even[j++] = arr[i];
            }
            else
                odd[k++] = arr[i];
        }*/
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even.get(even.size()-2)+odd.get(odd.size()-2));
//        Arrays.sort(even);
//        Arrays.sort(odd);
//        System.out.print(even);
//        System.out.print(odd);
//        int c = 0;
//        int b = 0;
//        for(j = 0; j< even.length; j++)
//        {
//            c = even[even.length-2];
//        }
//        for(k = 0; k< odd.length; k++)
//        {
//            b = odd[odd.length-2];
//        }
//        System.out.println(c+b);
//        //System.out.println(even[n-2] + odd[n-2]);
    }
}
