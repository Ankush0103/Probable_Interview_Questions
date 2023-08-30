import java.util.Scanner;
public class Char_Swap {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = ("Abaaaba ok get ako");
            String s2 = s1.replace('a', 'b');
            System.out.println(s2);
    }
}
//
//public class Main {
//    static void replaceCharacter(char[] str, char c1, char c2) {
//        int j = 0;
//        int n = str.length;
//        for (int i = 0; i < n; i++) {
//            if (str[i] != c1) {
//                str[j++] = str[i];
//            } else {
//                str[j++] = c2;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        // Given string
//        char[] str = "abacd".toCharArray();
//        char c1 = 'a';
//        char c2 = 'x';
//
//        // Function call
//        replaceCharacter(str, c1, c2);
//
//        // Print the string
//        System.out.println(str);
//    }
//}