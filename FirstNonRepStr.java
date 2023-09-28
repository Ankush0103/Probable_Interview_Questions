public class FirstNonRepStr {
    public static void main(String[] args) {
        String s = "cdadcda";
        int n = s.length();
        int[] freq = new int[256];
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++)
        {
            freq[arr[i]]++;
        }
        int min = Integer.MAX_VALUE;
        int idx = 0;
        char ans;
        // Frequency of first min index so we start from last sos that first will overlap last.
        for(int i = 0; i<n; i++)
        {
            char ch = s.charAt(i);
            for(int j = i+1; j<n; j++)
            {
                if(arr[j]==ch)
                {
                    idx = j;
                    //ans = arr[j];
                }
            }
        }
        for(int i = 0; i<n; i++) {
            if (i == idx)
                System.out.println(arr[idx]);
        }
    }
}
