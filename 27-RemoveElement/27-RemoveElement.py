# Last updated: 7/18/2025, 7:00:48 PM
class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i = 0

        for j in range(len(nums)):
            if nums[j] != val:
                nums[i] = nums[j]
                i+=1

        return i
            
        