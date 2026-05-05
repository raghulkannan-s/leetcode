// Last updated: 5/5/2026, 4:36:56 PM
1class Solution {
2    public String longestPalindrome(String s) {
3
4        int n = s.length();
5        StringBuilder sb = new StringBuilder(s);
6        String r = sb.reverse().toString();
7        int[][] dp = new int[n+1][n+1];
8
9        int max = 0;
10        int maxi = 0;
11
12        for( int i = 1; i <=n; i++ ){
13            for( int j = 1; j <=n; j++ ){
14                if (s.charAt(i - 1) == r.charAt(j - 1)) {
15                    dp[i][j] = 1 + dp[i - 1][j - 1];
16
17                    int startInOriginal = i - dp[i][j];
18                    int startInReverseMapped = n - j;
19
20                    if (startInOriginal == startInReverseMapped && dp[i][j] > max) {
21                        max = dp[i][j];
22                        maxi = i;
23                    }
24                }
25                else dp[i][j] = 0;
26            }
27        }
28
29        System.out.println(maxi);
30
31        StringBuilder res = new StringBuilder();
32
33        while( max-->0 ){
34            res.append( s.charAt(--maxi) );
35        }
36
37        return res.toString();
38        
39
40    }
41}