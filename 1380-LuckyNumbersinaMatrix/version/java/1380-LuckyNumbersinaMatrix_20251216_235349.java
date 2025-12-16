// Last updated: 12/16/2025, 11:53:49 PM
1class Solution {
2    public int[] findDiagonalOrder(int[][] mat) {
3        
4        int m = mat.length;
5        int n = mat[0].length;
6
7        List<Integer>[] diagonals = new ArrayList[m+n-1];
8        for (int i = 0; i < diagonals.length; i++) {
9            diagonals[i] = new ArrayList<>();
10        }
11
12        int[] result = new int[m*n];
13        int k = 0;
14
15        for ( int row = 0; row < m; row++ ){
16            for ( int col = 0; col < mat[row].length; col++ ){
17                int sum = row+col;
18                diagonals[sum].add(mat[row][col]);
19            }
20        }
21
22        for ( int i = 0; i < diagonals.length; i++ ){
23            if( i%2 == 0 ){
24                for ( int j = diagonals[i].size()-1; j >= 0; j-- ){
25                    result[k++] = diagonals[i].get(j);
26                }
27            }
28            else{
29                for ( int j = 0; j < diagonals[i].size(); j++ ){
30                    result[k++] = diagonals[i].get(j);
31                }
32            }
33        }
34
35        return result;
36
37
38    }
39}