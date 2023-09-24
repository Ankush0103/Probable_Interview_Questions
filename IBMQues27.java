/*
Input - "Hello World"
Output - "olleH dlrow"
 */
public class IBMQues27 {
    public static void main(String[] args) {
        String s = "Hello World";
        String rev = "";
        String[] str = s.split(" ");
        for(String s1: str)
        {
            String ans = "";
            for(int i = s1.length()-1; i>=0; i--)
            {
                char ch = s1.charAt(i);
                ans = ans + ch;
            }
            rev = rev + ans + " ";
        }
        System.out.println(rev);
    }
}
