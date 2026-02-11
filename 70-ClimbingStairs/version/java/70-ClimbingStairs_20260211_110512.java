// Last updated: 2/11/2026, 11:05:12 AM
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
15        dp[n] = solve(n-1, dp) + solve(n-2, dp);
16
17        return dp[n];
18
19
20    }
21}