# Last updated: 11/29/2025, 12:54:22 AM
1class Solution(object):
2    def reverseString(self, s):
3        """
4        :type s: List[str]
5        :rtype: None Do not return anything, modify s in-place instead.
6        """
7        n = len(s)
8        if n == 1:
9            return
10        start,end = 0,n-1
11
12        while (start < end):
13            s[start],s[end] = s[end], s[start]
14            start+=1
15            end-=1
16
17
18        