import java.util.Locale;

/*Capitalize first and last letter of string*/
public class Capfl {
    public static void main(String[] args) {
        String s = "Keep up programming";
        String newstr = "";
        String[] str = s.split("\\s"); // Splits sentence into individual words
        for(String s1 : str)
        {
            int length = s1.length();
            String first = s1.substring(0, 1);
            String rest =  s1.substring(1, s1.length() - 1);
            String last = s1.substring(s1.length()-1, s1.length());
            newstr  += first.toUpperCase() + rest + last.toUpperCase() + " ";
        }
        System.out.println(newstr);
    }
}
