// Last updated: 5/6/2026, 11:10:54 PM
1class Solution {
2
3    public char[][] rotateTheBox(char[][] boxGrid) {
4
5        int n = boxGrid.length;
6        int m = boxGrid[0].length;
7
8        for (int i = 0; i < n; i++) {
9            for (int j = m - 1; j >= 0; j--) {
10
11                if (boxGrid[i][j] == '#') {
12                    moveRight(i, j, boxGrid);
13                }
14            }
15        }
16
17        char[][] res = new char[m][n];
18
19        for (int i = 0; i < n; i++) {
20            for (int j = 0; j < m; j++) {
21                res[j][n - i - 1] = boxGrid[i][j];
22            }
23        }
24
25        return res;
26    }
27
28    void moveRight(int row, int col, char[][] grid) {
29
30        int cols = grid[0].length;
31        int newCol = col;
32        while (newCol + 1 < cols && grid[row][newCol + 1] == '.') newCol++;
33        if (newCol != col) {
34            grid[row][newCol] = '#';
35            grid[row][col] = '.';
36        }
37    }
38}