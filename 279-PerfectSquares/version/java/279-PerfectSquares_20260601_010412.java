// Last updated: 6/1/2026, 1:04:12 AM
1class Solution {
2    public int numSquares(int n) {
3
4        int[] dp = new int[n + 1];
5
6        Arrays.fill(dp, Integer.MAX_VALUE);
7
8        dp[0] = 0;
9
10        for (int i = 1; i <= n; i++) {
11
12            for (int j = 1; j * j <= i; j++) {
13                dp[i] = Math.min( dp[i], 1 + dp[i - j * j] );
14            }
15        }
16
17        return dp[n];
18    }
19}