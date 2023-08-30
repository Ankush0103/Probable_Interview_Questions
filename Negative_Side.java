/*
Negative elements at 1 side.
int[] arr = {- 1, 0, 3, 1, -4}
 */
public class Negative_Side {

    public static void shift(int[] arr)
    {
        int n = arr.length;
        int j = 0;
        for(int i = 0; i<n; i++)
        {
            for(j = i + 1; j<n; j++)
            {
                if(arr[i]<0)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            /*if(arr[i]<0)
            {
                if(i!=j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }*/
        }
        for(int i = 0; i<n; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int[] arr = {2, - 1, 0, 3, 1, -4, -3};
        shift(arr);
    }
}
