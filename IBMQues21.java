/*
Ordering a list of given dates.
 */
import java.util.*;
public class IBMQues21 {
    public static void main(String[] args) {
        ArrayList<String> datel = new ArrayList<>();
        datel.add("2020-03-25");
        datel.add("2019-01-27");
        datel.add("2020-03-26");
        datel.add("2020-02-26");
        System.out.println(datel);
        Collections.sort(datel);
        System.out.println(datel);
    }
}
