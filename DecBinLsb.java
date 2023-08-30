import java.util.*;
public class DecBinLsb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr2[i] = arr[i] >> s;
        }
        for(int j = 0; j<n; j++)
        {
            System.out.print(arr2[j] + " ");
        }
    }
}
