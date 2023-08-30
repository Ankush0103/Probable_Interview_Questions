/*
Find nth row in pascal triangle
 */
import java.io.*;

class NthrowPas {

    static void generateNthrow(int N) {

        int prev = 1;
        System.out.print(prev);

        for (int i = 1; i <= N; i++) {
            int curr = (prev * (N - i + 1)) / i;
            System.out.print(", " + curr);
            prev = curr;
        }
    }

    // Driver code
    public static void main(String[] args) {
        int N = 3;
        generateNthrow(N);
    }
}