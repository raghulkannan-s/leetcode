// Last updated: 4/29/2026, 4:09:39 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        List<Integer> res = new ArrayList<>();
8
9        int count = n*m;
10        int dir = 0;
11
12        int[] dx = { 0, 1, 0, -1 };
13        int[] dy = { 1, 0, -1, 0 };
14
15        int row = 0;
16        int col = 0;
17
18        int curr = 0;
19
20        while( curr++ < count ){
21
22            res.add( matrix[row][col] );
23            matrix[row][col] = 101;
24
25            int newRow = row + dx[dir];
26            int newCol = col + dy[dir];
27
28            if( newRow >= n || newRow < 0 || newCol >= m || newCol < 0 || matrix[newRow][newCol] == 101 ){
29                dir = (dir+1)%4;
30            }
31
32            row += dx[dir];
33            col += dy[dir];
34
35        }
36
37        return res;
38
39
40    }
41}