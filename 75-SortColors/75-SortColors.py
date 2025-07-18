# Last updated: 7/18/2025, 7:00:47 PM
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low, mid, high = 0, 0, len(nums)-1

        while mid < high+1 :

            if nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low+=1
                mid+=1

            elif nums[mid] == 1:
                mid+=1

            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high-=1

            


