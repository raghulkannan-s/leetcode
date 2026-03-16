// Last updated: 3/16/2026, 3:44:37 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        
4        int[][] dp = new int[word1.length()+1][word2.length()+1];
5        for (int[] row : dp) Arrays.fill(row, -1);
6        return helper(word1, word2, dp, word1.length(), word2.length());
7    }
8
9    public int helper(String s, String t, int[][] dp, int i, int j) {
10        if (i == 0) return j;
11        if (j == 0) return i;
12        
13        if (dp[i][j] != -1) return dp[i][j];
14        
15        if (s.charAt(i-1) == t.charAt(j-1)) {
16            dp[i][j] = helper(s, t, dp, i-1, j-1);
17        } else {
18            dp[i][j] = 1 + Math.min(
19                helper(s, t, dp, i-1, j-1),
20                Math.min(
21                    helper(s, t, dp, i-1, j),
22                    helper(s, t, dp, i, j-1)
23                )
24            );
25        }
26        return dp[i][j];
27    }
28
29}