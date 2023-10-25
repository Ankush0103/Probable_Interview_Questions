public class GCD_HCF {
    public static void main(String[] args) {
        int a = 52;
        int b = 50;
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        int hcf = a;
        System.out.println("HCF: " + hcf);
        //System.out.println(findgcd(a,b));
        /*int gcd = 1;
        for(int i = 1; i<=x&&i<=y; i++)
        {
            if(x%i==0&&y%i==0)
                gcd = i;
        }
        System.out.println(gcd);*/

    }
    /*static int findgcd(int a, int b)
    {
        if(b==0)
            return a;
        return findgcd(b, a%b);
    }*/
}

