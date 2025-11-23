# Last updated: 11/24/2025, 1:12:39 AM
class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        for i in range( 0, len(nums) ):
            if( i != nums[i] ):
                return i
        return nums[i]+1