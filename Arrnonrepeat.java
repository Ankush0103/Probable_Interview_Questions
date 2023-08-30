import java.util.Arrays;

public class Arrnonrepeat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 3, 4, 5};
        Arrays.sort(arr);
        int n = arr.length;

        int count = 0;
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
            if(flag==0)
                System.out.println(arr[i]);
        }

    }
}
