import java.util.Scanner;

/*
Question 8: Hostel warden
Problem Statement :
There is a hostel warden in some XYZ hostel. He is very strict with students. He has some set of rules to allow students to let them out.
Students are in random order but warden don’t allow them in that way.
Rule 1- whose initial is a prime value should go out before whose initial is a composite value.
Rule 2- if two students have prime value , a student with less value goes out first
Rule 3- if two students have composite value , a student with greater value goes out first
NOTE:- consider the ASCII value of the initial to find it is prime or composite.

Input format:
The first line of input contains the number of students N
The second line of input contains random order of the students S.
(students at index zero goes out first and students at index N-1 goes last)

Constraints
1<=number of students <=105
33<=ASCII Of Characters<=126

Output Format
The single line of output should contain the required modified order of students to go out.

Sample Input
13
Kkunjkhahorin

Sample Output
akkuronnjihhK

Explanation
For primes: a<k
For Composite: K<h<i<j<n<o<r<u
Adding up logic, the required answer is akkuronnjihhK
 */
import java.util.*;
public class MitsogoQ9 {
    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for(int i = 2; i<=n/2; i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // ASCII Value
        /*char ch = 'a';
        int num = ch - '0' + 48;
        num = ch;
        System.out.println(num);*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i<n; i++)
            str[i] = sc.next();
        Arrays.sort(str);
        String s = "";
        String s1 = "";
        String ans = "";
        for(int i = 0; i<n; i++)
        {
            s+=str[i];
        }
        for(int i = 0; i<n; i++)
        {
            if(isPrime(s.charAt(i)-'0'+48))
            {
                ans+=s.charAt(i);
            }
            else
                continue;
        }
        for(int i = str.length-1; i>=0; i--)
        {
            s1 += str[i];
        }
        for(int i = 0; i<n; i++)
        {
            if(!isPrime(s1.charAt(i)-'0'+48))
            {
                ans+=s1.charAt(i);
            }
            else
                continue;
        }
        System.out.println(ans);
    }
}
