// Does not apply for negative numbers
import java.util.*;
public class FreqMaxnum {
    public static int maxFrequencyNumber(int n, int[] arr) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        //n = sc.nextInt();
        arr = new int[n];
        for(int k = 0; k<n; k++)
            arr[k] = sc.nextInt();
        int[] freq = new int[256];
        for(int i = 0; i<n; i++)
            freq[arr[i]]++;
        int max = Integer.MIN_VALUE;
        for(int i = 255; i>=0; i--)
        {
            if(freq[i]==0)
                continue;
            max = Math.max(max, freq[i]);
        }
        for(int i = 0; i<arr.length; i++)
        {
            if(max==freq[arr[i]]) {
                ans = arr[i];
                break;
            }
        }

        return ans;//return ans for each test case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(maxFrequencyNumber(n, arr));
    }
}
