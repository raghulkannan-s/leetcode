// Last updated: 3/24/2026, 6:24:02 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        
4        int n = word1.length();
5        int m = word2.length();
6
7        int[] prev = new int[m+1];
8
9        for( int i = 1; i<=n; i++ ){
10            int[] curr = new int[m+1];
11            for( int j = 1; j<=m; j++ ){
12                if( word1.charAt(i-1) == word2.charAt(j-1) ){
13                    curr[j] = 1 + prev[j-1];
14                }else{
15                    curr[j] = Math.max( prev[j], curr[j-1] );
16                }
17            }
18            prev = curr;
19        }
20        return (n-prev[m]) + (m-prev[m]);
21    }
22}