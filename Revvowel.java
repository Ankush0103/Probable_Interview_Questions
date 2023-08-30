/*
Reverse vowel of String
Input - String s = "hello"
Output = "holle"
 */
public class Revvowel {
    public static boolean isVowel(char c)
    {
        return (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||
                c=='u'||c=='U');
    }
    public static String reverseVowel(String s1)
    {
        int j = 0;
        char[] s = s1.toCharArray();
        String vowel = "";
        for(int i = 0; i<s.length; i++)
        {
            if(isVowel(s[i]))
            {
                j++;
                vowel += s[i];
            }
        }
        for(int i = 0; i<s.length; i++)
        {
            if(isVowel(s[i]))
                s[i] = vowel.charAt(--j);
        }
        return String.valueOf(s);
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowel(s));
    }
}
