# Last updated: 12/4/2025, 2:20:21 PM
1class Solution:
2    def diagonalSum(self, mat: List[List[int]]) -> int:
3        
4        n = len(mat)
5        res = 0
6        sub = 0
7
8        for i in range(n):
9            res+= mat[i][i]
10            res+= mat[i][n-1-i]
11
12        if( n % 2 != 0 ):
13            sub = mat[n//2][n//2]
14
15        return res - sub
16        