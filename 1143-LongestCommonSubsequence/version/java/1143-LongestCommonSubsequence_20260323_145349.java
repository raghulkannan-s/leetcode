// Last updated: 3/23/2026, 2:53:49 PM
1class Solution {
2    public int longestCommonSubsequence(String a, String b) {
3        
4        int[][] dp = new int[a.length()+1][b.length()+1];
5        for( int[] arr : dp ){
6            Arrays.fill( arr, -1 );
7        }
8
9        return helper( 0, 0, a.toCharArray(), b.toCharArray(), dp );
10
11    }
12
13
14    private static int helper( int i, int j, char[] a, char[] b, int[][] dp ){
15
16        if( i == a.length || j == b.length ) return 0;
17        if( dp[i][j] != -1 ) return dp[i][j];
18        
19        if( a[i] == b[j] ){
20            return dp[i][j] = 1 + helper( i+1, j+1, a, b, dp );
21        }
22        
23        int skipI = helper( i+1, j, a, b, dp );
24        int skipJ = helper( i, j+1, a, b, dp );
25
26        return dp[i][j] = Math.max( skipI, skipJ );
27
28    }
29
30
31
32}