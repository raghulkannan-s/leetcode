# Last updated: 12/5/2025, 1:15:57 AM
1class Solution(object):
2    def checkValid(self, mat):
3        """
4        :type matrix: List[List[int]]
5        :rtype: bool
6        """
7        n = len(mat)
8        target = { i:1 for i in range( 1, n+1 ) }
9
10        def freq_check( arr ):
11            freq = {}
12            for x in arr:
13                freq[x] = freq.get(x, 0)+1
14
15            if freq != target:
16                return False
17            
18            return True
19
20
21        for r in range(n):
22
23            if not freq_check(mat[r]): 
24                return False
25            if not freq_check([mat[i][r] for i in range(n)]): 
26                return False
27
28
29        return True