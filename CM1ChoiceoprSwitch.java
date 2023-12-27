/*
Choice of operation
Input -> a = 40, b = 60, c = 1
Output -> 100 (40+60)
c = 1 = add, c = 2 = sub, c = 3 = mul, c = 4 = div
 */
import java.util.*;
public class CM1ChoiceoprSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;
        while(true)
        {
            System.out.println("1.Add  2.Substrct  3.Multiply  4.Divide  5.Exit");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch (c)
            {
                case 1: //Add
                    res = a + b;
                    System.out.println(res);
                    break;
                case 2: //Sub
                    res = a-b;
                    System.out.println(res);
                    break;
                case 3: //Mul
                    res = a*b;
                    System.out.println(res);
                    break;
                case 4: //Div
                    res = a/b;
                    System.out.println(res);
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    System.exit(0);
                default:
                    System.out.println("Enter correct input");
            }
        }
    }
}
