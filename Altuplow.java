// String s = CampusMonk
// Output = cAmPuSmOnK
public class Altuplow {
    public static void main(String[] args) {
        String s = "CampusMonk";
        char[] ch = s.toCharArray();
        String s1 = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(i%2!=0) {
                s1 += Character.toUpperCase(s.charAt(i));
            }
            else
                s1 += Character.toLowerCase(ch[i]);
        }
        System.out.println(s1);
    }
}
