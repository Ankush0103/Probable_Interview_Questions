/*Repeating element in array*/
public class Arrrepeat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 3, 4, 5};
        int n = arr.length;
        //int[] arr = new int[n];
        int count = 0;
        int flag = 0;
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++)
                if(arr[i]==arr[j])
                    System.out.println(arr[i] + " "); // Prints 1 time repeating elemnts
        }
        /*for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if((i!=j)&&(arr[i]==arr[j]))
                    System.out.println(arr[i]); // Prints their occurence as number of times.
            }
        }*/
    }
}
