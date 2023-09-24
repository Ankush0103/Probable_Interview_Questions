/*
Write a program to find duplicate characters in a given string.
 */

public class IBMQues13 {
    public static void main(String[] args) {
        String s = "abanjklk";
        char[] str = s.toCharArray();
        int n = s.length();
        // Prints duplicate along as many times(Not recommended)
        /*for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(s.charAt(i)==s.charAt(j)&&(i!=j))
                    System.out.println(s.charAt(j));
            }
        }*/
        int count;
        for(int i = 0; i<n; i++)
        {
            count = 0;
            for(int j = i+1; j<n; j++)
            {
                if(str[i]==str[j] && str[i] != ' ') {
                    count++;
                    str[j] = '\0';
                }
            }
            if(count>0&&str[i]!='\0')
                System.out.println(str[i]);
        }

    }
}
