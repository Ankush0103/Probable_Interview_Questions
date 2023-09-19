public class Maxdig {
    public static void main(String[] args) {
        int num = 3241;
        int max = 0;
        while(num>0)
        {
            int rem = num%10;
            if(rem>max)
                max = rem;
            num = num/10;
        }
        System.out.println(max);
        //System.out.println(4);
    }
}
