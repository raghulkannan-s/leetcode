# Last updated: 7/19/2025, 12:24:14 AM
# made it better by checking if the length is odd and return False, and conditions clean
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


