import java.util.Scanner;

public class DecTOBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bin = new int[255];
        int idx = 0;
        while(n>0)
        {
            bin[idx++] = n%2;
            n = n/2;
        }
        for(int i = idx-1; i>=0; i--)
        {
            System.out.print(bin[i] + " ");
        }
    }
}
