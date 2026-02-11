// Last updated: 2/11/2026, 12:30:22 PM
1class Solution {
2
3    public boolean wordBreak(String s, List<String> wordDict) {
4        
5      Set<String> set = new HashSet<String>(wordDict);
6      boolean[] dp = new boolean[s.length()+1];
7
8        dp[0] = true;
9
10      for( int i = 1; i<=s.length(); i++ ){
11        for( int j = 0; j < i; j++ ){
12            if( dp[j] && set.contains(s.substring(j, i)) ){
13                dp[i] = true;
14                break;
15            }
16        }
17      }
18
19        return dp[s.length()];
20
21    }
22}
23