/*
LCM of 3 numbers
 */
class IBMQues8 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        int n3 = 4;
        int sum = 0;
        for(int i = 2; i<Integer.MAX_VALUE; i++)
        {
            if((i%n1==0)&&(i%n2==0)&&(i%n3==0))
            {
                System.out.println(i);
                break;
            }
        }
    }
}
