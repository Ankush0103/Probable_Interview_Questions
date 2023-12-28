/*
Breaking number into multiple parts and getting max product of those parts.
Input - 4
Output - 4(4-> 2 + 2 ->2*2=4)
Input - 6
Output - 9(6-> 3 + 3 ->3*3=9)
Input - 8
Output - 18(18-> 2 + 3 + 3 ->2*3*3=18)
 */
/*
Python Code-:
n = int(input())
p=1
while n%3!=0:
    n-=2
    p*=2
print(p*(3**(n//3)))
 */
import java.util.*;
public class TCSQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        while(n%3!=0)
        {
            n=n-2;
            p=p*2;
        }
        System.out.println(p*(Math.pow(3, n/3)));
    }
}
