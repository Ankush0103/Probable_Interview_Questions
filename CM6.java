/*
Flowerbed No adjacent flower 1 means flower there, 0 means empty
Input - arr = [1, 0, 0, 0, 1] n = 1
        Output = 1; /// At index 2 1 flower can be planted and tehre will be no adjacent
Input - arr = [1, 0, 0, 0, 1] n = 2
        Output = 0; /// 2 flowers cannot be planted without adjcent violation
 */
import java.util.*;
public class CM6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = {1, 0, 0, 0, 1};
        int n = sc.nextInt();
        int flag = 0;
        if(n==0)
            flag = 1;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]==0 && (i==0||arr[i-1]==0) && (i== arr.length-1||arr[i+1]==0)){
                arr[i] = 1;
                n--;
                if(n==0)
                    flag = 1;
            }
        }
        if(flag==1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
