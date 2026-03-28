// Last updated: 3/28/2026, 8:56:24 PM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        
4        StringBuilder temp = new StringBuilder(s).reverse();
5        String r = temp.toString();
6
7        int n = s.length();
8
9        int[] prev = new int[n+1];
10        for( int i = 1; i<=n; i++ ){
11            int[] curr = new int[n+1];
12            for( int j = 1; j<=n; j++ ){
13                if( s.charAt(i-1) == r.charAt(j-1) ){
14                    curr[j] = 1 + prev[j-1];
15                }
16                else{
17                    curr[j] = Math.max( prev[j], curr[j-1] );
18                }
19            }
20            prev = curr;
21        }
22
23        return prev[n];
24
25    }
26}