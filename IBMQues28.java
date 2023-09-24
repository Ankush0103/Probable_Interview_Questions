/*

 */

public class IBMQues28 {
    public static void main(String[] args) {
        String reg = "6785 3456 1337";
        String dob = "03/12/1972";
        String c = "yes";
        if(reg.length()!=14||dob.length()!=10||(c!="yes"&&c!="no"))
        {
            System.out.println("Invalid output");
            return;
        }
        String[] str = dob.split("/");
        System.out.println(str[2]);
        int age = 2023 - Integer.parseInt(str[2]);
        if(age>60 || c == "n")
            System.out.println(1);
        else if (age>45) {
            System.out.println(2);
        } else if (age>30) {
            System.out.println(3);
        }

    }
}
