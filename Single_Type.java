public class Single_Type {
    public static void main(String[] args) {
        int res = 0;
        int [] nums = {1, 2, 2, 1, 4};
        for(int i = 0; i<nums.length; i++)
            res = res^nums[i];
        System.out.println(res);
    }
}
