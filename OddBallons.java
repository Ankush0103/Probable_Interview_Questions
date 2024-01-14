import java.util.*;
public class OddBallons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = {'a', 'b', 'b', 'b', 'c', 'c', 'a', 'f', 'c'};
        Arrays.sort(ch);
        String ans ="";
        int[] freq = new int[255];
        for(int i = 0; i< ch.length; i++)
            freq[ch[i]]++;
        int occ = 0;
        for(int i = freq.length-1; i>=0; i--)
        {
            if (freq[i] % 2 != 0)
            {
                occ = freq[i];
            }
        }
        for(int i = 0; i<ch.length; i++)
        {
            if(occ==freq[ch[i]])
                ans += ch[i];
        }
        System.out.println(ans);
    }
}
