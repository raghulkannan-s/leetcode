// Last updated: 6/1/2026, 11:20:14 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3        
4        int[][] dp = new int[coins.length][amount+1];
5
6        for( int i = 0; i<coins.length; i++ ){
7            dp[i][0] = 1;
8        }
9
10        for( int j = 1; j <= amount; j++ ){
11            if( j % coins[0] == 0 ){
12                dp[0][j] = 1;
13            }
14            else{
15                dp[0][j] = 0;
16            }
17        }
18
19        for( int i=1; i<coins.length; i++ ){
20            for( int j=1; j <= amount; j++ ){
21                if( j < coins[i] ){
22                    dp[i][j] = dp[i-1][j];
23                }
24                else{
25                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i]];
26                }
27            }
28        }
29
30        return dp[coins.length-1][amount];
31
32    }
33}