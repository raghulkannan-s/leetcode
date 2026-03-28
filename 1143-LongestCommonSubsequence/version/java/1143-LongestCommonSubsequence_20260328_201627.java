// Last updated: 3/28/2026, 8:16:27 PM
1class Solution {
2    public int longestCommonSubsequence(String a, String b) {
3        
4        int n = a.length();
5        int m = b.length();
6
7        int[] prev = new int[m+1];
8
9        for( int i = 1; i <=n; i++ ){
10            int[] curr = new int[m+1];
11
12            for( int j = 1; j<=m; j++ ){
13
14                if( a.charAt(i-1) == b.charAt(j-1) ){
15                    curr[j] = 1 + prev[j-1];
16                }else{
17                    curr[j] = Math.max( prev[j], curr[j-1] );
18                }
19            }
20            prev = curr;
21        }
22
23        return prev[m];
24
25
26    }
27}