/*Find Missing array ekement
arr = {1, 2, 4} Output = 3
* */
public class MissingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++)
            sum += arr[i];
        System.out.println(((n+1)*(n+2))/2 - sum);
    }
}

/*
String length recursion
int reclength(String str)
{
    if(s.equals(""))
        return 0;
    else
        return rec(str.substring(1)) + 1;
}
 */
