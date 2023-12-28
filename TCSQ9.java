/*
Remainder of str when divided by k
String s = "456"
int k = 7
Output -> 1
 */
import java.util.*;
public class TCSQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int num = Integer.parseInt(s);
        System.out.println(num%k);
    }
}
