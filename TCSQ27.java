/*
R1 rupees per hour for the first N hours and then R2 rupees per hour. Total time X in minutes.
FInd total travelling cost. Note while converting minutes into hours ceiling value considered i.e 90 minutes = 2 hours.
Input - r1 = 20, n = 4
        r2 = 40
        x = 300;
Output - 120
Explaination - Total travelling hours = 300/60 = 5 hours
               Rupees 20/hour for first 4 hours = 20*4 = 80 rupees
               Rupees 40/hour in 5 hours = 40*1 = 40 rupees
               Total = 80 + 40 = 120 rupees.
 */
import java.util.*;
public class TCSQ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int n = sc.nextInt();
        int r2 = sc.nextInt();
        int x = sc.nextInt();
        int t = 0;
        int ans = 0;
        if(x%60==0)
            t = x/60;
        else
            t = x/60 + 1;
        if(t<=4)
            ans += t*r1;
        else
            ans += r1*4 + r2*(t-4);
        System.out.println(ans);
    }
}
