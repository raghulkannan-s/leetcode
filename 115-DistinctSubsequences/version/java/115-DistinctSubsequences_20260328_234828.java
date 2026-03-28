// Last updated: 3/28/2026, 11:48:28 PM
1class Solution {
2    public int numDistinct(String s, String t) {
3        
4        int n = s.length();
5        int m = t.length();
6
7        int[] prev = new int[m+1];
8        prev[0] = 1;
9
10        for( int i = 1; i < n+1; i++ ){
11            int[] curr = new int[m+1];
12            curr[0] = 1;
13            for( int j = 1; j<m+1; j++ ){
14                if( s.charAt(i-1) == t.charAt(j-1) ){
15                    curr[j] = prev[j-1] + prev[j];
16                }
17                else{
18                    curr[j] = prev[j];
19                }
20            }
21            prev = curr;
22        }
23
24        return prev[m];
25
26    }
27}