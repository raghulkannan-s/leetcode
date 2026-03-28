// Last updated: 3/28/2026, 8:26:42 PM
1class Solution {
2    public int minDistance(String a, String b) {
3        
4        int n = a.length();
5        int m = b.length();
6
7        int[] prev = new int[m+1];
8
9        for( int i = 1; i<=n; i++ ){
10
11            int[] curr = new int[m+1];
12
13            for( int j = 1; j<=m; j++ ){
14                if( a.charAt(i-1) == b.charAt(j-1) ){
15                    curr[j] = 1+prev[j-1];
16                }else{
17                    curr[j] = Math.max( prev[j], curr[j-1] );
18                }
19
20            }
21            prev = curr;
22        }
23
24        int lcs = prev[m];
25
26        return (n - lcs) + (m - lcs);
27
28
29    }
30}