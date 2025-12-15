// Last updated: 12/15/2025, 6:31:56 PM
1class Solution {
2    public int finalPositionOfSnake(int n, List<String> commands) {
3        
4        int[][] matrix = new int[n][n];
5        int count = 0;
6
7        for ( int i = 0; i < n; i++ ){
8            for( int j = 0; j < n; j++){
9                matrix[i][j] = count++;
10            }
11        }
12
13        int row = 0;
14        int col = 0;
15
16        for ( String com : commands){
17
18            if (com.equals("RIGHT")){
19                col++;
20            }
21            else if (com.equals("LEFT")){
22                col--;
23            }
24            else if (com.equals("DOWN")){
25                row++;
26            }
27            else if (com.equals("UP")){
28                row--;
29            }
30            
31        }
32
33        return matrix[row][col];
34
35    }
36}