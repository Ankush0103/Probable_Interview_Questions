import java.util.*;
public class Rep01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s  = Integer.toString(n);
        //String s1 = s.replace('0', '1');
        String s1 = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='0')
                s1 = s1 + '1';
            else
                s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
    }
}
