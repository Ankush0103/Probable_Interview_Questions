import java.util.*;
public class Allnonrepstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the string");

        String str = sc.next ();	//Taking input as a string from the user
        int freq[] = new int[256];
        char[] ch = str.toCharArray();
        //Calculating frequency of each character
        for (int i = 0; i < ch.length; i++)
            freq[ch[i]]++;
        int idx = 0;
        System.out.println ("The non repeating characters are : ");
        for (int i = 0; i < 256; i++) {
            if (freq[i]==1)    //finding the character whose frequency is 1
                System.out.print((char) i + " ");
        }
        /*char[] s = input.toCharArray();
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
            System.out.println("No non repeating letter");*/

    }
}
