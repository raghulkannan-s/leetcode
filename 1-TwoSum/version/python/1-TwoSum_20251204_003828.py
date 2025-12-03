# Last updated: 12/4/2025, 12:38:28 AM
1class Solution(object):
2    def twoSum(self, nums, target):
3        """
4        :type nums: List[int]
5        :type target: int
6        :rtype: List[int]
7        """
8        seen = {}
9
10        for i in range(len(nums)):
11            need = target - nums[i]
12            if need in seen:
13                return [ i, seen[need] ]
14            seen[nums[i]] = i
15
16
17
18        
19        