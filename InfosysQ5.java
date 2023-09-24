/*
There is a battle between heroes and villains going on. You have M heroes, all of them have the same health H. There are N villains,
health of the i-th villain is Vi.

When a hero, with health H battles a villain with health Vi, one of the three scenarios can happen:

if H > Vi: The villain is defeated, and the health of the hero is decreased by Vi if H < Vi: The villain wins, his health is not affected,
and the hero is no longer able to fight. if H = Vi: Both are considered defeated, and neither can fight.

The heroes start fighting villains one by one in the same order, first villain 1 then villain 2 and so on. It might be possible
that before defeating all the villains, all the heroes are defeated. Therefore, to ensure the victory of the heroes,
you want to remove some villains from the front.

Your task is to find the minimum number of villains you need to remove from the front such that the victory of the heroes is guaranteed.

Note: If in the last battle, both the hero and villain are defeated and no more heroes or villains remain, it would still be
considered a victory since all the villains are defeated.

Input Format
N :: INTEGER
The first line contains an integer, N, denoting the number of villains N :: 1 -> 2*10^5
M :: INTEGER
The next line contains an integer, M, denoting the number of heroes M :: 1 -> 2*10^5
H :: INTEGER
The next line contains an integer, H, denoting the health of each of the heroes H :: 1 -> 10^9
array :: INTEGER ARRAY
Each line i of the N subsequent lines (where 0 ≤ i < N) contains an integer describing the health of each of the villains.
array[i] :: 1 -> 10^9
Sample Input 1:
4
4
3
3
1
3
3

Sample Output 1 :
0

Sample input 2:
5
3
3
1
2
3
1
1

Sample Output 2:
0

Sample input 3:
5
1
4
1
2
3
1
3

Sample Output 3:
3
 */
import java.util.*;
public class InfosysQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int villain = sc.nextInt();
        int hero = sc.nextInt();
        int herohealth = sc.nextInt();
        int[] arr = new int[villain];
        for(int i = 0; i< arr.length; i++)
            arr[i] = sc.nextInt();
        int d=herohealth;
        for(int j = (villain-1); j>=0; j--){

            if(d >=arr[j]){
                d = d - arr[j];
                if(d==0){
                    hero--;
                    if(hero==0){
                        System.out.println(j);
                        return;
                    }
                    d = hero;
                }
            }
            else if(d < arr[j]){
                hero--;
                if(hero==0){
                    System.out.println(j+1);
                    return;
                }
                j++;
                d=hero;
            }
        }
    }
}
