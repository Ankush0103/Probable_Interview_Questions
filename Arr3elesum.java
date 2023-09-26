import java.util.Arrays;

public class Arr3elesum {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        Arrays.sort(arr);
        int n = arr.length;
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        int flag = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = i + 1; j<n; j++)
            {
                for(int k = j + 1; k<n; k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                    {
                        flag = 1;
                        idx1 = i;
                        idx2 = j;
                        idx3 = k;
                    }
                }
            }
        }
        if(flag==1)
            System.out.println(arr[idx1] + " " + arr[idx2] + " " + arr[idx3]);
        else
            System.out.println("No triplet");
    }
}
