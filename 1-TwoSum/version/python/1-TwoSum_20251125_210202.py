# Last updated: 11/25/2025, 9:02:02 PM
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        seen = {}

        for i in range(len(nums)):
            need = target - nums[i]
            if need in seen:
                return [ seen[need], i ]
            else:
                seen[nums[i]] = i
        
        