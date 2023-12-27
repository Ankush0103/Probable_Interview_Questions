/*
Input - 11223
Output - 3 (prints number which occur only 1 time
 */
import java.util.*;

public class  OddoccDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String s = String.valueOf(num);
            //char rep = 'a';
            char[] str = s.toCharArray();
            Arrays.sort(str);
            int[] freq = new int[256];
            for(int i = 0; i< str.length; i++)
                freq[str[i]]++;
            //int max = Integer.MIN_VALUE;
            int occ = 0;
            for(int i = 0; i<256; i++)
            {
                if(freq[i]%2!=0)
                    occ = freq[i];
            }
            int ans = 0;
            for(int i = 0; i< str.length; i++)
            {
                if(occ == freq[str[i]])
                    ans = str[i]-48;
            }
            System.out.println(ans);
    }
}
