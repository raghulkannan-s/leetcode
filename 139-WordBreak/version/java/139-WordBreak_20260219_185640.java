// Last updated: 2/19/2026, 6:56:40 PM
1class Solution {
2
3    public boolean wordBreak(String s, List<String> word) {
4        
5        boolean[] dp = new boolean[s.length()+1];
6
7        dp[0] = true;
8
9        for( int i = 1; i<=s.length(); i++ ){
10
11                for( String w : word ){
12                    
13                    int start =  i - w.length();
14
15                    if( start>=0 && dp[start] && s.substring(start, i).equals(w) ) {
16                        dp[i] = true;
17                        break;
18                    }
19                }
20            
21        }
22
23        return dp[s.length()];
24
25    }
26}
27