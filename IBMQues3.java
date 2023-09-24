/*
Max 4 elements sum and min 4 elements sum addition
*/

class IBMQues3 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 5};
        int n = arr.length;
        int maxsum = 0;
        int minsum = 0;
        //Arrays.sort(arr);
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(n<4)
            System.out.println("Only 3 elements");
        else
        {
            for(int i = 0; i<4; i++)
            {
                minsum+=arr[i];
            }
            for(int i = n- 1; i>=n-4; i--)
            {
                maxsum+=arr[i];
            }
        }
        System.out.println(maxsum);
        System.out.println(minsum);
    }
}
