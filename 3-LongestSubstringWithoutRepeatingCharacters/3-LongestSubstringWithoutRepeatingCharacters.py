# Last updated: 7/18/2025, 7:00:54 PM
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        left = 0
        maxLength = 0
        cmap = {}

        for right in range(len(s)):
            char = s[right]
            
            if char in cmap and cmap[char] >= left:
                left = cmap[char]+1
            
            cmap[char] = right

            maxLength = max( maxLength, right - left + 1 )
            
        return maxLength    


            
