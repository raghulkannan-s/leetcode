// Last updated: 3/31/2026, 11:13:41 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int n = prices.length;
5        int[][][] dp = new int[n][2][3];
6        
7        for( int t = 1; t<2+1; t++ ){
8            dp[0][1][t] = -prices[0];
9        }
10
11        for( int i = 1; i < n; i++ ){
12            for( int t = 1; t<2+1; t++ ){
13                
14                dp[i][1][t] = Math.max(
15                    dp[i-1][1][t],
16                    dp[i-1][0][t-1] - prices[i]
17                );
18                
19                dp[i][0][t] = Math.max(
20                    dp[i-1][0][t],
21                    dp[i-1][1][t] + prices[i]
22                );
23
24
25            }
26        }
27
28        return dp[n-1][0][2];
29
30    }
31}