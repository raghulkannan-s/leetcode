# Last updated: 7/26/2025, 11:36:34 PM
class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        digits = set()

        for ch in s:
            if ch.isdigit():
                digits.add(int(ch))

        if len(digits) < 2:
            return -1

        first, second = -1, -1

        for val in digits:
            if val > first:
                second = first
                first = val
            elif val > second:
                second = val

        return second
