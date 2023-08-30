/*
Sort first half in ascending and second half in descending order
 */
public class Sortascdes {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5, 6};
        int n = arr.length;
        for(int i = 0; i<n-1; i++)
        {
            for(int j = 0; j<n/2; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j = n/2; j<n-1; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }



        for(int i = 0; i<n; i++)
            System.out.println(arr[i]);
    }
}
