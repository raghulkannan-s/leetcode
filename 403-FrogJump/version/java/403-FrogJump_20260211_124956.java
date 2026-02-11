// Last updated: 2/11/2026, 12:49:56 PM
1class Solution {
2    public int fib(int n) {
3      
4      int[] dp = new int[n+1];
5      Arrays.fill(dp, -1);
6      return solve( n, dp );
7      
8    }
9
10
11    public int solve( int n, int[] dp ){
12
13        if( n < 2 ) return dp[n] = n;
14
15        if( dp[n] != -1 ) return dp[n]; 
16
17        dp[n] = solve(n-1, dp) + solve(n-2 , dp);
18        
19        return dp[n];
20    }
21}