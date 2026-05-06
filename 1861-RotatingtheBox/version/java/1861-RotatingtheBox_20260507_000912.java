// Last updated: 5/7/2026, 12:09:12 AM
1class Solution {
2
3    public char[][] rotateTheBox(char[][] boxGrid) {
4
5        int n = boxGrid.length;
6        int m = boxGrid[0].length;
7
8        for (int i = 0; i < n; i++) {
9
10            int empty = m - 1;
11
12            for (int j = m - 1; j >= 0; j--) {
13                if (boxGrid[i][j] == '*') {
14                    empty = j - 1;
15                } else if (boxGrid[i][j] == '#') {
16                    boxGrid[i][j] = '.';
17                    boxGrid[i][empty] = '#';
18                    empty--;
19                }
20            }
21        }
22
23        char[][] res = new char[m][n];
24
25        for (int i = 0; i < n; i++) {
26            for (int j = 0; j < m; j++) {
27                res[j][n - i - 1] = boxGrid[i][j];
28            }
29        }
30
31        return res;
32    }
33
34    void moveRight(int row, int col, char[][] grid) {
35
36        int cols = grid[0].length;
37        int newCol = col;
38        while (newCol + 1 < cols && grid[row][newCol + 1] == '.') newCol++;
39        if (newCol != col) {
40            grid[row][newCol] = '#';
41            grid[row][col] = '.';
42        }
43    }
44}