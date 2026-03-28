// Last updated: 3/28/2026, 9:52:17 PM
1class Solution {
2    public int minInsertions(String s) {
3        
4        StringBuilder sb = new StringBuilder(s);
5        String r = sb.reverse().toString();
6
7        int n = s.length();
8
9        int[] prev = new int[n+1];
10
11        for( int i = 1; i < n+1; i++ ){
12            int[] curr = new int[n+1];
13            for( int j = 1; j<n+1; j++ ){
14                if( s.charAt(i-1) == r.charAt(j-1) ){
15                    curr[j] = 1 + prev[j-1];
16                }else{
17                    curr[j] = Math.max( prev[j], curr[j-1] );
18                }
19            }
20            prev = curr;
21        }
22
23        int lcs = prev[n];
24
25        return n - lcs;
26
27    }
28}