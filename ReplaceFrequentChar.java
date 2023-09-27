/*
Replace most frequent character with given char if two character hace same frequency then replace character with lowest ascii.
String s = "jjkdkksjjdjf"
char rep = a
Ouput - "aakdkksaadaf" (j is most frequent so it is relaced by a)
 */
import java.util.*;
public class ReplaceFrequentChar {
    public static void main(String[] args) {
        String s = "jjkdkksjjdjf";
        char rep = 'a';
        char[] str = s.toCharArray();
        Arrays.sort(str);
        int[] freq = new int[256];
        for(int i = 0; i< str.length; i++)
            freq[str[i]]++;
        int max = Integer.MIN_VALUE;
        for(int i = 255; i>=0; i--)
        {
            if(freq[i]==0)
                continue;
            else{
                max = Math.max(max, freq[i]);
            }
        }
        for(int i = 0; i< str.length; i++)
        {
            if(max == freq[str[i]])
                s = s.replace(str[i], rep);
        }
        System.out.println(s);
    }
}
