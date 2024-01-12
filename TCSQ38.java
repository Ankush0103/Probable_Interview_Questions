/*
Before the outbreak of corona virus to the world, a meeting happened in a room in Wuhan. A person who attended that meeting had
COVID-19 and no one in the room knew about it! So everyone started shaking hands with everyone else in the room as a gesture of respect
and after meeting unfortunately every one got infected! Given the fact that any two persons shake hand exactly once,
Can you tell the total count of handshakes happened in that meeting?
Output Format :
Print the number of handshakes for each test-case in a new line.

Constraints :
1 <= T <= 1000
0 < N < 106

Sample Input :
2//Test Cases
1
2

Output :
0
1

Explanation :
Case 1 : The lonely board member shakes no hands, hence 0.
Case 2 : There are 2 board members, 1 handshake takes place.
 */
import java.util.*;
public class TCSQ38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<t; i++)
        {
            int n = sc.nextInt();
            list.add(n*(n-1)/2);
            //System.out.println((n*(n-1))/2); // nc2
        }
        System.out.println(list);
    }
}
