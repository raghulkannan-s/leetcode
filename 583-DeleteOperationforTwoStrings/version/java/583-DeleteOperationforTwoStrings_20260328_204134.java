// Last updated: 3/28/2026, 8:41:34 PM
1class Solution {
2    public String shortestCommonSupersequence(String a, String b) {
3        
4        int n = a.length();
5        int m = b.length();
6
7        int[][] dp = new int[n+1][m+1];
8
9        for( int i = 1; i<=n; i++ ){
10            for( int j = 1; j<=m; j++ ){
11                if( a.charAt(i-1) == b.charAt(j-1) ){
12                    dp[i][j] = 1 + dp[i-1][j-1];
13                }else{
14                    dp[i][j] = Math.max( dp[i][j-1], dp[i-1][j] );
15                }
16            }
17        }
18
19        int i = n, j = m;
20        StringBuilder sb = new StringBuilder();
21
22        while( i > 0 && j > 0 ){
23            char ac = a.charAt(i-1);
24            char bc = b.charAt(j-1);
25            if( ac == bc ){
26                sb.append( ac );
27                i--; j--;
28            }
29            else if( dp[i-1][j] > dp[i][j-1]  ){
30                sb.append( ac );
31                i--;
32            }
33            else{
34                sb.append( bc );
35                j--;
36            }
37        }
38
39        while( i > 0 ) sb.append(a.charAt(i-- -1));
40        while( j > 0 ) sb.append(b.charAt(j-- -1));
41
42        return sb.reverse().toString();
43
44
45    }
46}