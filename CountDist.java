import java.util.Arrays;

public class CountDist {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 4, 3, 3, 2};
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i-1]!=arr[i])
                count++;
            /*int j = 0;
            for(j = 0; j<i; j++)
            {
                if(arr[i]==arr[j])
                    break;
            }
            if(i==j)
                count++;*/
        }
        System.out.println(count);

    }
}
