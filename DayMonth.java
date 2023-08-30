import java.util.*;
public class DayMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        if(m<1||m>12)
            System.out.println("Invalid Month");
        if((m==2) && ((y%4==0) || ((y%100==0)&&(y%400==0))))
            System.out.println("Days: 29");
        else if (m==2) {
            System.out.println("Days: 28");
        }
        else if (m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
            System.out.println("Days: 31");
        }
        else
            System.out.println("Days: 30");
    }
}
