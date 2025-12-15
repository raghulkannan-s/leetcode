// Last updated: 12/15/2025, 9:38:44 PM
// brute
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        for ( int i = 0; i < matrix.length; i++){
5            for ( int j = 0; j< matrix[i].length; j++ ){
6                if (matrix[i][j] == target){
7                    return true;
8                }
9            }
10        }
11        return false;
12
13    }
14}