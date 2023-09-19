/*
Input - "12abAB"
Output - maxdig(49) + maxdig(50) + maxdig(97) + maxdig(98) + maxdig(65) + maxdig(66)
        Ascii-1       Ascii-2       Ascii-a     Ascii-b      Ascii-A      Ascii-B
        9           +       5    +      9      +        9   +       6   +       6
        44
 */
public class ASCIISumMaxdig {
    public static int Max(int num){
        int max = 0;
        while(num>0)
        {
            int rem = num%10;
            if(rem>max)
                max = rem;
            num = num/10;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "12abAB";
        int sum = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                sum+=Max(s.charAt(i) - '0' + 48);
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
                sum+=Max(s.charAt(i));
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
                sum+=Max(s.charAt(i));
        }
        System.out.println(sum);
    }
}
