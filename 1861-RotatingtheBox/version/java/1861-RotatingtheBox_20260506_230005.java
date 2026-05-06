// Last updated: 5/6/2026, 11:00:05 PM
1class Solution {
2    
3    public char[][] rotateTheBox(char[][] boxGrid) {
4        int n = boxGrid.length;
5        int m = boxGrid[0].length;
6
7        char[][] res = new char[m][n];
8
9        for( int i = 0; i < n; i++ ){
10            for(int j = 0; j < m; j++){
11                res[j][i] = boxGrid[i][j];
12            }
13        }
14
15        for( int i = 0; i < m; i++ ){
16
17            int left = 0;
18            int right = n-1;
19
20            while( left < right ){
21
22                char temp = res[i][left];
23                res[i][left] = res[i][right];
24                res[i][right] = temp;
25
26                left++; right--;
27            }
28        }
29
30        for( int i = m-1; i >= 0; i-- ){
31            for(int j = n-1; j >= 0; j--){
32                if( res[i][j] == '#' ){
33                    pulldown( i, j, res );
34                }
35            }
36        }
37        return res;
38
39    }
40
41    void pulldown( int row, int col, char[][] res ){
42        int n = res.length;
43        while( row < n-1 && res[row+1][col] == '.' ){
44            char temp = res[row][col];
45            res[row][col] = res[row+1][col];
46            res[row+1][col] = temp;
47            row++;
48        }
49    }
50
51}