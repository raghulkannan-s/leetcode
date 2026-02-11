// Last updated: 2/11/2026, 11:04:44 AM
1class Solution {
2    public int climbStairs(int n) {
3        
4        int[] dp = new int[n+1];
5        return solve(n, dp);
6
7    }
8
9
10    public int solve(int n, int[] dp){
11
12        if( n <= 2 ) return n;
13
14        if( dp[n] != 0 ) return dp[n];
15
16
17        if( dp[n] == 0 ) {
18            dp[n] = solve(n-1, dp) + solve(n-2, dp);
19        }
20
21
22        return dp[n];
23
24
25    }
26}