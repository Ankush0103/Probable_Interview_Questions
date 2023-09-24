import java.util.*;
public class IBMQues14 {
    public static void main(String[] args)  {

            // Getting bytes from the custom input string
            // using getBytes() method and
            // storing it in a byte array
            byte[] bytes = "Geeksforgeeks".getBytes();

            System.out.println(Arrays.toString(bytes));

            // Creating a string from the byte array
            // without specifying character encoding
            String string = new String(bytes);

            // Printing the string
            System.out.println(string);
    }
}
