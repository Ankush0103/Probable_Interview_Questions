public class SortByFreq {
    public static void countfr(int[] arr, int n)
    {
        n = arr.length;
        for(int i = 0; i<n; i++)
        {
            int flag = 0;
            int count = 0;
            for(int j = i + 1; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                continue;
            for(int j = 0; j<=i; j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            System.out.println(arr[i] + " : " + count);
        }
    }
    public static int freq(int[] arr, int n)
    {
        n = arr.length;
        for(int i = 0; i<n; i++)
        {
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        int n;
        int[] arr = {1, 2, 1, 3, 3, 3};
        n = arr.length;
        countfr(arr, 6);
    }
}
