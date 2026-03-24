// Last updated: 3/24/2026, 6:15:54 PM
1class Solution {
2    public int minInsertions(String s) {
3        
4        StringBuilder temp = new StringBuilder(s);
5        String r = temp.reverse().toString();
6
7        int n = s.length();
8
9        int[] prev = new int[n+1];
10
11        for( int i = 1; i<=n; i++ ){
12            int[] curr = new int[n+1];
13            for( int j = 1; j<=n; j++ ){
14                if( s.charAt(i-1) == r.charAt(j-1) ){
15                    curr[j] = 1 + prev[j-1];
16                }else{
17                    curr[j] = Math.max( prev[j], curr[j-1] );
18                }
19            }
20            prev = curr;
21        }
22
23        return n - prev[n];
24
25    }
26}