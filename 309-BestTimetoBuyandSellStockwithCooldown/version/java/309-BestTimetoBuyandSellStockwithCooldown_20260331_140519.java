// Last updated: 3/31/2026, 2:05:19 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][] dp = new int[n+2][2];
5
6        for( int i = n-1; i>=0; i-- ){
7
8            dp[i][0] = Math.max(
9                dp[i+1][0],
10                dp[i+1][1] - prices[i]
11            );
12
13            dp[i][1] = Math.max(
14                dp[i+1][1],
15                dp[i+2][0] + prices[i]
16            );
17
18        }
19
20
21        return dp[0][0];
22
23    }
24}