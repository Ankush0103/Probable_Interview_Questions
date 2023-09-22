/*
Reverse first k elements
 int []a = {1, 2, 3, 4, 5, 6};
 k = 4;
 4 3 2 1 5 6
 */
public class Revkele {
    public static void main(String[] args) {
        int []a = {1, 2, 3, 4, 5, 6};
        int k = 4;
        for(int i = 0; i<k/2; i++)
        {
            int temp = a[i];
            a[i] = a[k-i-1];
            a[k-i-1] = temp;
        }
        for(int i = 0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}
