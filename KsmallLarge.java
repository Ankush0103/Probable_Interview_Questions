
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        int []arr = {4, 5, 6, 7};
        for(int num: arr)
            a1.add(num);
        Collections.sort(a1);
        int k = 2;
        // i.e. second smallest i.e index 1
        System.out.println(a1.get(1));
        // i.e. second largest i.e index -2
        System.out.println(a1.get(a1.size()-2));
    }
}
