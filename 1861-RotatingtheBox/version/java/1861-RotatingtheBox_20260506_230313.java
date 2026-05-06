// Last updated: 5/6/2026, 11:03:13 PM
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
11                res[j][n-i-1] = boxGrid[i][j];
12            }
13        }
14
15
16        for( int i = m-1; i >= 0; i-- ){
17            for(int j = n-1; j >= 0; j--){
18                if( res[i][j] == '#' ){
19                    pulldown( i, j, res );
20                }
21            }
22        }
23        return res;
24
25    }
26
27    void pulldown( int row, int col, char[][] res ){
28        int n = res.length;
29        while( row < n-1 && res[row+1][col] == '.' ){
30            char temp = res[row][col];
31            res[row][col] = res[row+1][col];
32            res[row+1][col] = temp;
33            row++;
34        }
35    }
36
37}