/*
Automorphic Number
A Number that when squared ends with the number itself is known as the Automorphic Number. Let's try and understand the concept of Automorphic Number,
Example
Input : 5
Output : 25
Explanation : Number = 5
when squared you get 25
as 25 ends with 5
 */

import java.util.*;
public class Autmorphic {
    public static int automorphic(int n)
    {
        int sq = n*n;
        while (n!=0)
        {
            if(n%10!=sq%10)
                return 0;
            n/=10;
            sq/=10;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        if(automorphic(n)==1)
            System.out.println("Num: " + n + " and " + sq + " is automorphic" );
        else
            System.out.println("Num: " + n + " and " + sq + " is not automorphic" );
    }
}
//
//    int num = 5;
//    int sq = num*num;
//    int a = sq%10;
//    System.out.println(a);
//    if(a == num)
//       System.out.println(true);
//    else
//       System.out.println(false);