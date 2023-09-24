/*
Remove vowels from string
 */
public class IBMQues10 {
    public static void main(String[] args) {
        String s = "aertoplk";
        String s1 = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                s1 = s1 + "";
            }
            else
                s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
    }
}
