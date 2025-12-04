# Last updated: 12/4/2025, 5:40:24 PM
1class Solution:
2    def checkValid(self, mat: List[List[int]]) -> bool:
3        
4        n = len(mat)
5        target = set(range( 1, n+1 ))
6
7        for row in range(n):
8
9            if set(mat[row]) != target:
10                return False
11    
12            col = set(mat[i][row] for i in range(n))
13
14            if col != target:
15                return False
16
17        return True
18                
19
20