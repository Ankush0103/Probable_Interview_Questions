/* First non repeating character of string */
import java.util.*;
public class NonrepStr {
    public static void main(String[] args) {
        String input ="prepinsta";
        char[] s = input.toCharArray();
        boolean flag = false;
        for(char i : s)
        {
            if(input.indexOf(i)==input.lastIndexOf(i))
            {
                flag = true;
                System.out.println("First non repeating letter: " + i);
                break;
            }

        }
        if(!flag)
            System.out.println("No non repeating letter");
    }
}
