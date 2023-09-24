/*
Decimal to binary
 */

class IBMQues22 {
    public static void main(String[] args) {
        int index = 0;
        int decimal = 17;
        int[] binary = new int[40];
        while(decimal>0)
        {
            binary[index++] = decimal%2;
            decimal/=2;
        }
        for(int i = index - 1; i>=0; i--)
            System.out.println(binary[i]);
    }
}
