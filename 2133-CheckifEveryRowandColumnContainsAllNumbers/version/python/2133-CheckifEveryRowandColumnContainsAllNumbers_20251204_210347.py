# Last updated: 12/4/2025, 9:03:47 PM
1class Solution(object):
2    def checkValid(self, mat):
3        """
4        :type matrix: List[List[int]]
5        :rtype: bool
6        """
7         
8        n = len(mat)
9        target = set(range( 1, n+1 ))
10
11        for row in range(n):
12
13            if set(mat[row]) != target:
14                return False
15    
16            col = set(mat[i][row] for i in range(n))
17
18            if col != target:
19                return False
20
21        return True