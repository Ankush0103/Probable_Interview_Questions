public class Maxdig {
    public static void main(String[] args) {
        int num = 324;
        int max = Integer.MAX_VALUE;
        while(num>0)
        {
            int rem = num%10;
            if(rem>max)
                max = rem;
        }
        System.out.println(max);
    }
}
