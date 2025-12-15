// Last updated: 12/15/2025, 2:07:55 PM
// first matrix
1class Solution {
2
3    public List<Integer> spiralOrder(int[][] matrix) {
4        
5        int row = matrix.length;
6        int col = matrix[0].length;
7
8        int top = 0;
9        int left = 0;
10        int right = col-1;
11        int bottom = row-1;
12
13        List<Integer> result = new ArrayList<>();
14
15        while( top<=bottom && left<=right ){
16
17            for( int i = left; i<=right; i++ ){
18                result.add(matrix[top][i]);
19            }
20            top++;
21
22            for( int i = top; i<=bottom; i++ ){
23                result.add(matrix[i][right]);
24            }
25            right--;
26
27            if( top <= bottom ){  
28                for( int i = right; i>=left; i-- ){
29                    result.add(matrix[bottom][i]);
30                }
31                bottom--;
32            }
33
34            if( left <= right ){ 
35                for( int i = bottom; i>=top; i-- ){
36                    result.add(matrix[i][left]);
37                }
38                left++;
39            }
40        }
41
42        return result;
43
44    }
45}