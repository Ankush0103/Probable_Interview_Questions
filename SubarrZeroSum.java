/*
Max Subarray with zero sum
 */
public class SubarrZeroSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        int n = arr.length;
        int flag = 0;
        int maxlen = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = i; j<n; j++)
            {
                int sum = 0;
                for(int k = i; k<=j; k++)
                    sum += arr[k];
                if(sum==0) {
                    flag = 1;
                    if(j-i+1>maxlen)
                        maxlen = j-i+1;
                }
            }
        }
        if(flag==1)
            System.out.println("Sum zero subarrray present with max length " + maxlen);
    }
}
