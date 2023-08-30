/*
# n = 6
# ranks = [4, 3, 7, 2, 6, 1]
# Ouput - 3 (If arr[i]<arr[i-1] then count increase)

 */
public class PreLess {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 2, 6, 1};
        int n = 6;
        int count = 0;
        int prev = arr[0];
        for(int i = 1; i<n; i++)
        {
            if(arr[i]<prev)
                count++;
            prev = arr[i];
        }
        System.out.println(count);
    }
}
