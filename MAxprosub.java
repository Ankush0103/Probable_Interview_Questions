/*MAximum product subarray*/
public class MAxprosub {
    public static void main(String[] args) {
        int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int s = 0;
        for(int i = 0; i<n; i++)
        {
            int pro = arr[i];
            for(int j = i + 1; j<n; j++)
            {
                //res = Math.max(res, pro);
                if(res<pro)
                {
                    res = pro;
                }
                pro*=arr[j];
            }
            res = Math.max(res, pro);
        }
        System.out.println(res);
        System.out.println(start);
        System.out.println(end);
    }
}
