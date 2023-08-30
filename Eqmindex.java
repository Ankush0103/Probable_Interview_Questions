/* Find eqm index of array i.e. leftside = rightside */
public class Eqmindex {
    public static void main(String[] args) {
        int[] arr =  {1, 5, 2, 2, 4};
        int n = arr.length;

        for(int i = 0; i<n; i++)
        {
            int lsum = 0;
            int rsum = 0;
            for(int j = 0; j<i; j++)
                lsum += arr[i];
            for(int j = i +1; j<n; j++)
                rsum += arr[i];
            if(rsum==lsum)
                System.out.println(i);
        }
    }
}
