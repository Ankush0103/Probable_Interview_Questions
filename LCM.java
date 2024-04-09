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
        int l = 0;
        for(int i = 1; i<Integer.MAX_VALUE; i++)
        {
            if((i%a==0)&&(i%b==0)) {
                l=i;
                break;
            }
        }
        System.out.println(hcf);
        int lcm = (a*b)/hcf;
        System.out.println(lcm);
        System.out.println(l);
    }
    /*
    public static void main(String[] args) {
        int a = 60;
        int b = 80;
        for(int i = a; i<Integer.MAX_VALUE; i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
     */
}
