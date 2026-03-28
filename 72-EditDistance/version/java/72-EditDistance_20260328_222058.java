// Last updated: 3/28/2026, 10:20:58 PM
1class Solution {
2    public int minDistance(String a, String b) {
3        
4        int n = a.length();
5        int m = b.length();
6
7        int[] prev = new int[m+1];
8
9        for( int i = 0; i < m+1; i++ ){
10            prev[i] = i;
11        }
12
13        for( int i = 1; i<n+1; i++ ){
14            int[] curr = new int[m+1];
15            curr[0] = i;
16            for( int j = 1; j<m+1; j++ ){
17                if( a.charAt(i-1) == b.charAt(j-1) ){
18                    curr[j] = prev[j-1];
19                }
20                else{
21                    curr[j] = Math.min( 
22                            1 + curr[j-1],
23                        Math.min(
24                            1 + prev[j],
25                            1 + prev[j-1]
26                        )
27                    );
28                }
29            }
30            prev = curr;
31        }
32        return prev[m];
33    }
34}