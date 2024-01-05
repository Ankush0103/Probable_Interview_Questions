/*
Given N gold wires, each wire has a length associated with it. At a time, only two adjacent small wires are assembled at the end of a large wire and the cost of forming is the sum of their length.
Find the minimum cost when all wires are assembled to form a single wire.
For Example:
Suppose, Arr[]={7,6,8,6,1,1,}
{7,6,8,6,1,1}-{7,6,8,6,2} , cost =2
{7,6,8,6,2}- {7,6,8,8}, cost = 8
{7,6,8,8} – {13,8,8}, cost=13
{13,8,8} -{13,16}, cost=16
{13, 16} – {29}, cost =29
2+8+13+16+29=68
Hence , the minimum cost to assemble all gold wires is 68.
Constraints
1<=N<=30
1<= Arr[i]<=100
Python Program -:
def minimum_cost(arr):
    n = len(arr)
    dp = [[0] * n for _ in range(n)]

    # Iterate over different lengths of wires
    for length in range(2, n + 1):
        for i in range(n - length + 1):
            j = i + length - 1
            dp[i][j] = float('inf')

            # Try different partition points between i and j
            for k in range(i, j):
                cost = dp[i][k] + dp[k + 1][j] + arr[i] + arr[k + 1]
                dp[i][j] = min(dp[i][j], cost)

    return dp[0][n - 1]

# Read the value of N from STDIN
n = int(input())
# Read the lengths of wires from STDIN
arr = []
for _ in range(n):
    arr.append(int(input()))
# Find the minimum cost to assemble all gold wires
min_cost = minimum_cost(arr)
# Print the minimum cost to STDOUT
print(min_cost)

 */
import java.util.*;
public class TCSQ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
    }
}
