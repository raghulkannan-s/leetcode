# Last updated: 7/18/2025, 7:00:34 PM
class Solution(object):
    def repeatedCharacter(self, s):
        """
        :type s: str
        :rtype: str
        """
        seen = []

        for char in s:
            
            if char in seen:
                return char
            
            seen.append(char)
        

        return ""