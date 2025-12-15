// Last updated: 12/16/2025, 3:18:26 AM
1class Solution {
2    public List<Integer> luckyNumbers(int[][] matrix) {
3        
4        List<Integer> rowMin = new ArrayList<>();
5        List<Integer> colMax = new ArrayList<>();
6
7        List<Integer> result = new ArrayList<>();
8
9        int m = matrix.length;
10        int n = matrix[0].length;
11
12        for ( int row = 0; row<m; row++ ){
13
14            int min = Integer.MAX_VALUE;
15
16            for ( int col = 0; col<n; col++){
17                if( matrix[row][col] < min ){
18                    min = matrix[row][col];
19                }
20            }
21
22            rowMin.add(min);
23        }
24
25        for ( int col = 0; col < n; col++ ){
26
27            int max = 0;
28
29            for ( int row = 0; row<m; row++){
30                if( matrix[row][col] > max ){
31                    max = matrix[row][col];
32                }
33            }
34
35            colMax.add(max);
36        }
37
38        for ( int row = 0; row<m; row++ ){
39
40            for ( int col = 0; col<n; col++){
41
42                if( matrix[row][col] == rowMin.get(row) && matrix[row][col] == colMax.get(col) ){
43                    result.add(matrix[row][col]);
44                }
45            }
46        }
47
48        return result;
49
50    }
51}