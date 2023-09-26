/*
Input - int arr1[] = {1, 4, 5, 7};
        int arr2[] = {10, 20, 30, 40};
        int k = 38;
Output - Closest pair is [7, 30]

 */
public class TwoArrsumcloseK {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 5, 7};
        int arr2[] = {10, 20, 30, 40};
        int k = 38;
        int min = Integer.MAX_VALUE;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int idx1 = 0;
        int idx2 = 0;
        int l = 0;
        int r = n2-1;
        while(l<n1&&r>=0)
        {
            if(Math.abs(arr1[l]+arr2[r] - k)<=min)
            {
                min = Math.abs(arr1[l]+arr2[r]-k);
                idx1 = l;
                idx2 = r;
            }
            if(arr1[l]+arr2[r]>k)
                r--;
            else
                l++;
        }
        System.out.println("Closest pair to " + k + " is " + arr1[idx1] + " and " + arr2[idx2]);
    }
}
