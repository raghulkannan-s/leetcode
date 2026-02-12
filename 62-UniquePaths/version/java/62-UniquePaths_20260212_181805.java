// Last updated: 2/12/2026, 6:18:05 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int[][] dp = new int[m][n];
5
6
7        int count = helper( 0, 0, m-1, n-1, dp );
8
9        return count;
10
11    }
12
13
14
15    public int helper( int m, int n, int mend, int nend, int[][] dp ){
16
17
18        if( m > mend || n > nend ){
19            return 0;
20        }
21        if( dp[m][n] > 0 ){
22            return dp[m][n];
23        }
24
25        if( m == mend && n == nend ){
26            return 1;
27        }
28
29        int count = helper( m+1, n, mend, nend, dp ) + helper( m, n+1, mend, nend, dp );
30
31        dp[m][n] = count;
32
33        return count;
34
35
36    }
37}