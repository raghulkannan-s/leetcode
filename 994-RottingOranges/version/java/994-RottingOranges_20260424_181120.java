// Last updated: 4/24/2026, 6:11:20 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3
4        int n = grid.length;
5        int m = grid[0].length;
6
7        int count = 0;
8
9        Queue<int[]> q = new LinkedList<>();
10
11        for( int i = 0; i < n; i++ ){
12            for( int j = 0; j < m; j++){
13                if( grid[i][j] == 2 ){
14                    q.add( new int[]{ i, j } );
15                }
16                else if( grid[i][j] == 1 ){
17                    count++;
18                }
19            }
20        }
21
22        if( count == 0 ) return 0;
23
24        int time = -1;
25
26        while( !q.isEmpty() ){
27
28            int size = q.size();
29
30            for( int s = 0; s<size; s++ ){
31                int[] node = q.poll();
32
33                int[] dr = { 0, 1, 0, -1 };
34                int[] dc = { 1, 0, -1, 0 };
35
36                for( int d = 0; d<4; d++ ){
37
38                    int r = node[0] + dr[d];
39                    int c = node[1] + dc[d];
40
41                    if( r >= 0 && r < n && c >= 0 && c<m && grid[r][c] == 1 ){
42                        grid[r][c] = 2;
43                        count--;
44                        q.add(new int[] { r, c });
45                    }
46                }
47            }
48
49            time++;
50        }
51
52        return ( count > 0 ) ? -1 : time;
53
54    }
55}