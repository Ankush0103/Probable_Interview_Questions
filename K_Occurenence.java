public class K_Occurenence {
    public static void main(String[] args)
    {
        int[] arr = { 1, 7, 4, 3, 4, 8, 7 };
        int k = 2;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check, if it occurs k times or not
            if (count == k) {
                System.out.println(arr[i]);
                break;
            }
        }

    }

}
