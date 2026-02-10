// Last updated: 2/10/2026, 5:36:08 PM
1class Solution {
2
3    public boolean wordBreak(String s, List<String> wordDict) {
4        
5        Set<String> set = new HashSet<>(wordDict);
6        boolean[] dp = new boolean[s.length() + 1];
7
8        dp[0] = true;
9
10        for (int i = 1; i <= s.length(); i++) {
11
12            for (int j = 0; j < i; j++) {
13
14                if (dp[j] && set.contains(s.substring(j, i))) {
15                    dp[i] = true;
16                    break;
17                }
18            }
19        }
20
21        return dp[s.length()];
22    }
23}
24