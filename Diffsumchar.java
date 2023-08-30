/*Q. doselect
        aosblecz
        Sample Output

        12
        Explanation

        'a' will change to 'd' in 3 units.

        'b' will change to 'e' in 3 units.

        'z' will change to 't' in 6 units.
*/
/*
public static int minimumUnits(String S1, String S2) {
        // Write your code here
        int n1 = S1.length();
        int[] arr1 = new int[n1];
        for(int i = 0; i<n1; i++)
        {
        char ch1 = S1.charAt(i);
        arr1[i] = (int)ch1;
        }

        int[] arr2 = new int[n1];
        for(int i = 0; i<n1; i++)
        {
        char ch2 = S2.charAt(i);
        arr2[i] = (int)ch2;
        }
        int[] arr3 = new int[n1];
        for(int i = 0; i<n1; i++)
        {
        arr3[i] = Math.abs(arr2[i]-arr1[i]);
        }
        int sum = 0;
        for(int i= 0; i<n1; i++)
        {
        sum += arr3[i];
        }
        return sum;
        }


}*/