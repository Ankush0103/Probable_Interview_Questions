import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int flag = 0;
        for(int i = 2; i<=a/2; i++)
        {
            if(a%i==0)
                flag = 1;
        }
        if(flag!=1)
            System.out.println("Prime Number");
        else
            System.out.println("Non prime Number");
    }
}
