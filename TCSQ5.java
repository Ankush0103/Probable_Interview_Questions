import java.util.Scanner;

/*
Oddly Even Problem Statement
Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits

Test Cases
Case 1
Input: 4567
Expected Output: 2
Explanation : Odd positions are 4 and 6 as they are pos: 1 and pos: 3, both have sum 10. Similarly, 5 and 7 are at even positions pos: 2 and pos: 4 with sum 12. Thus, difference is 12 – 10 = 2

Case 2
Input: 5476
Expected Output: 2
Case 3
Input: 9834698765123
Expected Output: 1
 */
public class TCSQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int o = s.charAt(0) - '0';
        int e = 0;
        for(int i = 1; i<s.length(); i++)
        {
            if(i%2==0)
            {
                o+=s.charAt(i) - '0';
            }
            else
            {
                e+=s.charAt(i) - '0';
            }
        }
        System.out.println(Math.abs(e-o));
    }
}
