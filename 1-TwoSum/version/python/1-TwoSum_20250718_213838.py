# Last updated: 7/18/2025, 9:38:38 PM
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        store = {}

        for i, num in enumerate(nums):
            diff = target - num
            if diff in store:
                return [ store[diff], i ]
            store[num] = i 
        return