// Last updated: 4/24/2026, 8:56:13 PM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3
4        int n = mat.length;
5        int m = mat[0].length;
6        
7        Queue<int[]> q = new LinkedList<>();
8        int[][] ans = new int[n][m];
9
10        for( int i = 0; i < n; i++ ){
11            for( int j = 0; j < m; j++ ){
12                if( mat[i][j] == 0 ){
13                    q.add( new int[] { i, j } );
14                }else{
15                    ans[i][j] = -1;
16                }
17            }
18        }
19
20        if( q.size() == 0 ) return mat;
21
22        int[] dx = { 0, 1, 0, -1 };
23        int[] dy = { 1, 0, -1, 0 };
24
25        while( !q.isEmpty() ){
26
27            int[] node = q.poll();
28
29            for( int d = 0; d<4; d++ ){
30                
31                int r = node[0] + dx[d];
32                int c = node[1] + dy[d];
33
34                if( r>=0 && r<n && c >= 0 && c < m && ans[r][c] == -1 ){
35                    ans[r][c] = ans[node[0]][node[1]] + 1;
36                    q.add(new int[] { r, c });
37                }
38
39            }
40
41        }
42        return ans;
43    }
44}