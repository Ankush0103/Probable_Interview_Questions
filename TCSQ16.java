
import java.util.HashSet;
import java.util.Scanner;

/*
Array Non-repeat (can also refer similar java programs)
Input - 3, arr = {2, 2, 3}
Ouput - 3 (It occurs only one time)
 */
public class TCSQ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            int flag = 0;
            for(int j = 0; j<n; j++)
            {
                if(arr[i]==arr[j]&&i!=j) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.print(arr[i] + " ");
        }

    }
}
