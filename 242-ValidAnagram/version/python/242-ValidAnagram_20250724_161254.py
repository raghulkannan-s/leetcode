# Last updated: 7/24/2025, 4:12:54 PM
# brute force in python
class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        return sorted(s) == sorted(t)
