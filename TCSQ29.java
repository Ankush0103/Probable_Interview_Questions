/*
Team winning max points
Input - 3
        A B 2-1
        B C 5-6
        C A 2-1
Output - C
         6
Explaination - C has won max point i.e 6 since it defeated B by 6-5 and A by 2-1.
Python Code -

n = int(input()) # No.of teams
x = [] # List to store name of teams for each match
y = {} # Dictonary to store scores of each match of teams

for i in range(n*(n-1)//2):
    x.append(input().split(" "))

for i in x: # Initializing dictionary
    y[i[0]] = 0
    y[i[1]] = 0

for i in range(n*(n-1)//2):
    p = x[i][-1].split("-")
    if int(p[0])>int(p[1]):
        y[x[i][0]]+=3
    elif int(p[0])<int(p[1]):
        y[x[i][1]]+=3
    else:
        y[x[i][0]]+=1
        y[x[i][1]]+=1

win = 0
team = ""

for i, j in y.items():
    if j>win:
        win = j
        team = i

print(team)
print(win)

 */
import java.util.*;
public class TCSQ29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i<n; i++)
        {
            str[i] = sc.next();
            /*int n1 = sc.nextInt();
            int n2 = sc.nextInt();*/
        }

        HashMap<Integer, Integer> map = new HashMap<>();

    }
}
