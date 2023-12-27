/*
Enter three 4-digit numbers
Input- 3521 2452 1352
Output - 1522 (Concat 1dig max + 10dig min + 100dig max + 1000dig min)
 */

import java.util.*;
public class ConcatenateDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three 4-digit numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int onesdig1 = 0;
        int onesdig2 = 0;
        int onesdig3 = 0;
        int onesdig4 = 0;
        int tensdig1 = Integer.MAX_VALUE;
        int tensdig2 = Integer.MAX_VALUE;
        int tensdig3 = Integer.MAX_VALUE;
        int tensdig4 = Integer.MAX_VALUE;
        int hunrdig1 = 0;
        int hunrdig2 = 0;
        int hunrdig3 = 0;
        int hunrdig4 = 0;
        int thoudig1 = Integer.MAX_VALUE;
        int thoudig2 = Integer.MAX_VALUE;
        int thoudig3 = Integer.MAX_VALUE;
        int thoudig4 = Integer.MAX_VALUE;
        onesdig1 = a%10;
        a/=10;
        tensdig1 = a%10;
        a/=10;
        hunrdig1 = a%10;
        a/=10;
        thoudig1 = a;
        onesdig2 = b%10;
        b/=10;
        tensdig2 = b%10;
        b/=10;
        hunrdig2 = b%10;
        b/=10;
        thoudig2 = b;
        onesdig3 = c%10;
        c/=10;
        tensdig3 = c%10;
        c/=10;
        hunrdig3 = c%10;
        c/=10;
        thoudig3 = c;
        int onesans = 0;
        int tensans = 0;
        int hunrans = 0;
        int thouans = 0;

        /*int onesmax = 0;
        int tensmin = 0;
        int hunrmax = 0;
        int thoumin = 0;*/
        onesans = Math.max(onesdig1, onesdig2);
        onesans = Math.max(onesdig3, onesans);
        onesans = Math.max(onesdig4, onesans);
        //System.out.println(onesans);
        tensans = Math.min(tensdig1, tensdig2);
        tensans = Math.min(tensdig3, tensans);
        tensans = Math.min(tensdig4, tensans);

        hunrans = Math.max(hunrdig1, hunrdig2);
        hunrans = Math.max(hunrdig3, hunrans);
        hunrans = Math.max(hunrdig4, hunrans);

        thouans = Math.min(thoudig1, thoudig2);
        thouans = Math.min(thoudig3, thouans);
        thouans = Math.min(thoudig4, thouans);

        System.out.println(thouans+""+hunrans+""+tensans+""+onesans);
    }
}
