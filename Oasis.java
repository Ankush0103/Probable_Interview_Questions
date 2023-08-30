/*Oasis visits a florish shop has N flowers each being of specific type and every flower cost
        1 unit. You are given type of each flower in array P =[P1, P2,.. Pn]. If he buys a flower of
        type p then he gets all flowers whise types lies between P and P+4 for free. find the price
        Oasis has to pay and buy all flowers.*/

import java.util.Scanner;
import java.util.Arrays;
public class Oasis {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int cost = 1;
        int last = arr[0];
        for(int i = 1; i<N; i++)
        {
            if(arr[i]>last+4)
            {
                cost++;
                last=arr[i];
            }
        }
        System.out.println(cost);

    }

}
