# Last updated: 7/18/2025, 10:59:49 PM
# better solution with 0ms solution with O(n) 0ms, instead of two loops to check and store then look for second element, just store everything in set then just check if its not digit just skip the iteration using continue
class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        digits = set(s)

        first, second = -1, -1

        for d in digits:
            if not d.isdigit():
                continue

            if int(d) > first:
                second = first
                first = int(d)
            elif int(d) > second:
                second = int(d)

        return second
