# Last updated: 12/5/2025, 1:03:58 AM
1class Solution(object):
2    def checkValid(self, mat):
3        """
4        :type matrix: List[List[int]]
5        :rtype: bool
6        """
7
8        n = len(mat)
9
10        target = { i:1 for i in range( 1, n+1 ) }
11
12        for row in range(n):
13
14            row_freq = {}
15
16            for i in range(n):
17                row_freq[mat[row][i]] = row_freq.get(mat[row][i], 0)+1
18
19            if row_freq != target:
20                return False
21    
22            col_freq = {}
23            for i in range(n):
24                col_freq[mat[i][row]] = col_freq.get(mat[i][row], 0)+1
25
26            if col_freq != target:
27                return False
28
29        return True