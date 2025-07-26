# Last updated: 7/26/2025, 11:37:03 PM
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) % 2 != 0:
            return False

        opened = []
        closeBrackets = { '}' : '{', ']' : '[', ')' : '(' }

        for bracket in s:

            if bracket in closeBrackets:
                if not opened or opened[-1] != closeBrackets[bracket]:
                    return False
                opened.pop()
            else :
                opened.append(bracket)

        return not opened


