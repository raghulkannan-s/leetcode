// Last updated: 3/31/2026, 11:39:35 AM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3
4        int n = prices.length;
5        int[][][] dp = new int[n+1][2][k+1];
6
7        for( int i = n-1; i>=0; i-- ){
8            for( int t = 1; t<=k; t++ ){
9
10                dp[i][0][t] = Math.max(
11                    dp[i+1][0][t],
12                    dp[i+1][1][t] - prices[i]
13                );
14
15                dp[i][1][t] = Math.max(
16                    dp[i+1][1][t],
17                    dp[i+1][0][t-1] + prices[i]
18                );
19
20            }
21        }
22
23
24        return dp[0][0][k];
25
26    }
27}