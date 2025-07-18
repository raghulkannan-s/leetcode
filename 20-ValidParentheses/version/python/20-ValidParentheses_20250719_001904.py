# Last updated: 7/19/2025, 12:19:04 AM
# This is my first attempt and first question in stack, and first submit was success.
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) == 1:
            return False

        opened = []

        openBrackets = [ '{', '[', '(' ]
        closeBrackets = { '}' : '{', ']' : '[', ')' : '(' }

        for bracket in s:

            if bracket in closeBrackets:
                if len(opened) == 0:
                    return False
                if opened[-1] == closeBrackets[bracket]:
                    opened.pop()
                else:
                    return False
            else :
                opened.append(bracket)

        
        if len(opened) == 0:
            return True
        
        return False


