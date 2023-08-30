/*
Java program to remove characters in a string except alphabets
 */
public class RemoveSpl {
    public static void main(String[] args) {
        String s = "$P*r;e..pi, ns'ta^?";
        String s1 = s.replaceAll("[^a-zA-Z]", "");
        /*for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)<'A'||s.charAt(i)>'Z'||s.charAt(i)<'a'||s.charAt(i)<'z') {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }*/
        System.out.println(s1);
    }
}
