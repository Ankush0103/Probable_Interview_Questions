/* Sum of digits in a string */
public class Sodstr {
    public static void main(String[] args) {
        String str="4PREP2INSTAA6";
        int sum = 0;
        String temp = "0";
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                sum+=str.charAt(i)-'0';
        }
        System.out.println(sum);
        //System.out.println(sum);
        /*for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                temp+=ch;
            else
            {
                sum += Integer.parseInt(temp);
                temp = "0";
            }

        }
        System.out.println(sum  + Integer.parseInt(temp));*/
    }
}
