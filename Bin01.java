import java.util.*;
public class Bin01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "1C01B0";
        if(s==null)
            System.out.println("-1");
        //char[] str = s.toCharArray();
        int res = s.charAt(0)-'0';//str[0];
        for(int i = 1; i<s.length();)
        {
            char op = s.charAt(i);
            i++;
            //int opr = str[i+1];
            if (op == 'A')
                res = res & (s.charAt(i)-'0');
            if(op == 'B')
                res = res | (s.charAt(i)-'0');
            if(op=='C')
                res = res ^ (s.charAt(i)-'0');
            i++;
        }
        System.out.println(res);
    }
}
