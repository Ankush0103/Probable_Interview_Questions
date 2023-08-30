/*
int[] arr = {4, 5, 1, 6, 3};
Index 2 -> 4 + 5 or 6+3
 */

class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 3};
        int n = arr.length;
        int tsum = 0;
        int lsum = 0;
        int ans = -1;
        for(int i = 0; i<n; i++)
        {
            tsum+=arr[i];
        }
        for(int i = 0; i<n; i++)
        {
            if(lsum==tsum-lsum-arr[i])
                ans = i;
            lsum+=arr[i];
        }
        System.out.println(ans);
    }
}
