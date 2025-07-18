# Last updated: 7/18/2025, 10:50:13 PM
class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        digits = set()
        for i in s:
            if i.isdigit():
                digits.add(int(i))

        first = second = -1

        if len(digits) < 2:
            return second

        for ch in digits:
            if ch > first:
                second = first
                first = ch
            elif ch > second:
                second = ch

        return second
