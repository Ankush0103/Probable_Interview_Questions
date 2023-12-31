/*
Sweet Seventeen Problem Statement
Given a maximum of four digit to the base 17 (10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value.
Test Cases
Case 1
Input – 1A
Expected Output – 27
Case 2
Input – 23GF
Expected Output – 10980
 */

/*
Python Program -
'''The int() function converts the specified value into an integer number.
We are using the same int() method to convert the given input.
int() accepts two arguments, number and base.
Base is optional and the default value is 10.
In the following program we are converting to base 17'''
num = str(input())
print(int(num,17))
 */
import java.util.*;
public class TCSQ3 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        hmap.put('A',10);
        hmap.put('B',11);
        hmap.put('C',12);
        hmap.put('D',13);
        hmap.put('E',14);
        hmap.put('F',15);
        hmap.put('G',16);
        hmap.put('a',10);
        hmap.put('b',11);
        hmap.put('c',12);
        hmap.put('d',13);
        hmap.put('e',14);
        hmap.put('f',15);
        hmap.put('g',16);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long num = 0;
        int k = 0;
        for(int i = s.length()-1; i>=0; i--)
        {
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z'))
                num = num + hmap.get(s.charAt(i))*(int)Math.pow(17, k++);
            else
                num = num + ((s.charAt(i)-'0')*(int)Math.pow(17, k++));
        }
        System.out.println(num);
    }
}
