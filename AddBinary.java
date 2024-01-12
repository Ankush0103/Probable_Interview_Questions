/*
Given two binary strings a and b, return their sum as a binary string.
Example 1:
Input: a = "11", b = "1"
Output: "100"
Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
 */

/*
LeetCode Solution No Runtime Error
StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
 */
import java.util.*;
import java.util.*;
public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String str = "";
        if(a.equals("0")&&b.equals("0")) {
            str = "0";
            System.out.println(str);
            return;
        }
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int dec1 = 0;
        int dec2 = 0;
        int p1 = 0;
        int p2 = 0;
        while(n1>0)
        {
            int temp1 = n1%10;
            dec1+=temp1*Math.pow(2,p1);
            p1++;
            n1/=10;
        }
        while(n2>0)
        {
            int temp2 = n2%10;
            dec2+=temp2*Math.pow(2,p2);
            p2++;
            n2/=10;
        }
        int ans = dec1+dec2;
        int[] bin = new int[255];
        int idx = 0;
        while(ans>0)
        {
            bin[idx++] = ans%2;
            ans = ans/2;
        }
        for(int i = idx - 1; i>=0; i--)
            str+=bin[i];
        System.out.println(ans); // Decimal Format
        System.out.println(str); // Binary Format
    }
}
