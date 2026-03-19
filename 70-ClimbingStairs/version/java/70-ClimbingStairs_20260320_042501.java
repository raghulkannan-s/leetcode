// Last updated: 3/20/2026, 4:25:01 AM
1class Solution {
2    public int climbStairs(int n) {
3       int[] dp =  new int[n+1];
4       dp[0] = 1;
5       dp[1] = 1;
6
7        for( int i = 2; i <= n; i++ ){
8
9            dp[i] = dp[i-1] + dp[i-2];
10
11        }
12
13        return dp[n];
14
15
16    }
17
18    
19}