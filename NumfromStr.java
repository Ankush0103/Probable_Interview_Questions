// Java implementation of the approach
// Also in main function small method is given
public class NumfromStr {

    // Function to return the modified string
    static String extractInt(String str)
    {
        // Replacing every non-digit number with a space(" ")
        str = str.replaceAll("[^0-9]", " "); // regular expression

        // Replace all the consecutive white spaces with a single space
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "avbkjd1122klj4 543 af";
        System.out.print(extractInt(str));
        // Small Method
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
                System.out.print(str.charAt(i) + "");
        }
    }
}

