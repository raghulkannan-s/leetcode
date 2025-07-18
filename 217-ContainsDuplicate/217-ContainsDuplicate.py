# Last updated: 7/18/2025, 7:00:42 PM
class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """ 
        seen = {}
        for i, num in enumerate(nums):
            if num in seen:
                return True
            seen[num] = i
        
        return False
            

        