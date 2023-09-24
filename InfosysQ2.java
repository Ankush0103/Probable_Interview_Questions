/*
Max frequency in a string

You have an interesting string S of length N. It is interesting because you can rearrange the characters of this string in any order.
You want to cut this string into some contiguous pieces such that after cutting, all the pieces are equal to one another.

You can’t rearrange the characters in the cut pieces or join the pieces together. You want to make the number of pieces as large as possible.
What is the maximum number of pieces you can get?
Note: You can observe that you may not want to cut the string at all, therefore the number of pieces is 1. Hence, the answer always exists.

Input Format
S :: STRING
The first line contains a string, S, denoting the string.
length(S) :: 1 -> 2 * 10^5

Sample Input 1:
zzzzz

Sample Output 1 :
5

Sample input 2:
ababcc

Sample Output 2:
2

Sample input 2:
abccdcabacda
Sample Output 2:
4
 */
import java.util.*;
public class InfosysQ2 {
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
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < freq.length; i++)
        {
            if(freq[i]>max)
                max = freq[i];
        }
        System.out.println(max);
    }
}
