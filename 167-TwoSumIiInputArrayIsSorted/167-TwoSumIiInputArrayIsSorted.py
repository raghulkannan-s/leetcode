# Last updated: 7/18/2025, 7:00:43 PM
class Solution(object):
    def twoSum(self, n, t):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        l, r = 0, len(n)-1

        while l < r:
            tot = n[l] + n[r]
            if  tot < t:
                l+=1
            elif tot > t:
                r-=1
            else:
                return [l+1, r+1]