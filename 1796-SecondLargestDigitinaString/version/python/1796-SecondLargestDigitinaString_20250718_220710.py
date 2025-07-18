# Last updated: 7/18/2025, 10:07:10 PM
# Brute force solution
class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        arr = list(s)
        nums = []
        for i in arr:
            if i.isdigit() and not i in nums:
                nums.append(i)
        nums.sort(reverse=True)
        if len(nums) >= 2:
            return int(nums[1])
        else:
            return -1