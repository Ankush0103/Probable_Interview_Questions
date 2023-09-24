import java.util.Scanner;
class Main1 {
    public static int solution(int nExcercise,int[] arr,int energy){
        int sum = 0;
        for(int i = 0; i< nExcercise; i++) {
            if (arr[i] == energy)
                return 1;

            for (int j = 0; j == energy; ) {
                return j + 1;
            }
            if (2 * sum >= energy) {
                return 2 * (i + 1);
            }
        }
    //if sum is not equal to the energy.
return -1;
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int energy = s.nextInt();
        int nExcercise = s.nextInt();
        int[] arr= new int[nExcercise];
        for (int i = 0; i < nExcercise; i++)
        {
            arr[i] = s.nextInt();
        }

        int ans = solution(nExcercise,arr,energy);
        System.out.println(ans);
    }
}

