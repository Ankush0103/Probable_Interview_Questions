class Reverse_word {
    public static void main(String[] args) {
        // Trims the input string to remove spaces
        String s = "Hello World";
        String[] str = s.trim().split("\\s+");
        String s1 = "";
        for (int i = str.length - 1; i >= 0; i--) {
            s1 += str[i] + " ";
        }
        System.out.println(s1 /*+ str[0]*/);

    }
}
