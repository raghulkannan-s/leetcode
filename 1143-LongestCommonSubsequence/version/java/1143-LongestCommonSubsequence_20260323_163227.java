// Last updated: 3/23/2026, 4:32:27 PM
1class Solution {
2    public int longestCommonSubsequence(String a, String b) {
3
4        char[] t1 = a.toCharArray();
5        char[] t2 = b.toCharArray();
6
7        int m = t1.length;
8        int n = t2.length;
9
10        int[] prev = new int[t2.length+1];
11
12
13        for( int i = 1; i <= m; i++ ){
14
15            int[] curr = new int[t2.length+1];
16
17            for( int j = 1; j <= n; j++ ){
18
19                if( t1[i-1] == t2[j-1] ){
20                    curr[j] = prev[j-1]+1;
21                }
22                else{
23                    int skip1 = prev[j];
24                    int skip2 = curr[j-1];
25
26                    curr[j] = Math.max( skip1, skip2 );
27                }
28            }
29            prev = curr;
30        }
31
32        return prev[n];
33
34    }
35}