/*
Code to Count Possible Decoding Of A Given Digit Sequence
Sequence = 131

Possible decoding (1, 3, 1,)    = ACA
Possible decoding (13, 1)   = MA
So, the total possible decoding’s of sequence 131 is 2.
 */

import java.util.*;
public class Decode {
    public static int count(char[] dig, int a)
    {
        int[] cnt = new int[a+1];
        cnt[0] = 0;
        cnt[1] = 1;
        for(int k = 2; k<=a; k++)
        {
            cnt[k] = 0;
            cnt[k] = k-1;
            if(dig[k-2]=='1'||(dig[k-2]=='2'&&dig[k-1]<'7'))
                cnt[k]+=cnt[k-2];
        }
        return cnt[a];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "127";
        char[] dig = s.toCharArray();
        System.out.println(count(dig, 3));
    }
}
