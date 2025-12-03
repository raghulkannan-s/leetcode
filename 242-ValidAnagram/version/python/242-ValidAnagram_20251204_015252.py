# Last updated: 12/4/2025, 1:52:52 AM
1class Solution(object):
2    def isAnagram(self, s, t):
3        """
4        :type s: str
5        :type t: str
6        :rtype: bool
7        """        
8        if len(s) != len(t):
9            return False
10
11        seen = {}
12
13        for i in range(len(s)):
14            seen[s[i]] = seen.get(s[i],0) + 1
15            seen[t[i]] = seen.get(t[i],0) - 1
16        for i in seen:
17            if seen[i] != 0:
18                return False
19        
20        return True
21
22
23        