/*
Find misssing eement of array
arr = {1, 3, 2, 5, 5};  Output - 4
arr = {2, 3, 5, 2, 4};  Output - 1
 */
import java.util.Arrays;

public class IBMQues19 {
     public  static int findMissing(int arr[], int N) {
        int left = 0, right = N - 1;
        while (left <= right) {

            int mid = (left + right) / 2;

            // If the middle element is not on
            // the middle index, then the missing element is mid + 1.
            if (arr[mid] != mid + 1 && arr[mid - 1] == mid) {
                return mid + 1;
            }

            // This case means that the missing element is
            // not to the left. So search the right.
            if (arr[mid] == mid + 1)
                left = mid + 1;

                // This case means that the missing element is not
                // to the right. So search the left.
            else
                right = mid - 1;
        }

        // Will reach here if no missing element found.
        return -1;
    }
        public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 5};
        int n = arr.length;
        Arrays.sort(arr);
        int res = 0;
        System.out.println(findMissing(arr, n));
        /*HashSet<Integer> set = new HashSet<>();
        for(int num: arr)
            set.add(num);
        System.out.println(set);
        for(int i = 1; i<=n; i++)
        {
            if(!set.contains(i)) {
                res = i;
                System.out.println(res);
                return;
            }
            else
                res = n + 1; // No missing integer
        }

        System.out.println(res);*/


    }
}
