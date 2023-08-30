/* Frequency of each letter in string */
import java.util.*;
public class FreqStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        char[] s = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            freq[i] = 1;
            for(int j = i + 1; j < str.length(); j++)
            {
                if(s[i] == s[j]) {
                    freq[i]++;
                    s[j] = '0';
                }
            }
        }
        for(int i = 0; i < freq.length; i++)
        {
            if(s[i]!= ' ' && s[i] != '0')
                System.out.println(s[i] + " : " + freq[i]);
        }
    }
}
