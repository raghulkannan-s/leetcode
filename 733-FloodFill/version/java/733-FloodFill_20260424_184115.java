// Last updated: 4/24/2026, 6:41:15 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        
4        int n = image.length;
5        int m = image[0].length;
6        int checkColor = image[sr][sc];
7        if( checkColor == color ) return image;
8        dfs( sr, sc, checkColor, color, image );
9        return image;
10
11    }
12
13    public void dfs( int i, int j, int checkColor, int color, int[][] image ){
14
15        int n = image.length;
16        int m = image[0].length;
17
18        if( i >= 0 && i < n && j >= 0 && j < m && image[i][j] == checkColor ){
19            image[i][j] = color;
20
21            int[] dr = { 0, 1, 0, -1 };
22            int[] dc = { 1, 0, -1, 0 };
23
24            for( int d = 0; d<4; d++ ){
25                dfs( i+dr[d], j+dc[d], checkColor, color, image );
26            }
27
28        }
29    }
30
31
32
33}