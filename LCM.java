public class LCM {
    public static void main(String[] args) {
        int a = 4;
        int b = 16;
        int hcf = 0;
        int max = a;
        if(b>a)
            max = b;
        for(int i = 1; i<=a&&i<=b; i++)
        {
            if(a%i==0&&b%i==0) {
                hcf=i;
            }
        }
        System.out.println(hcf);
        int lcm = (a*b)/hcf;
        System.out.println(lcm);
    }
}
