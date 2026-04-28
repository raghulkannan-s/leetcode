// Last updated: 4/28/2026, 4:52:03 PM
1class Solution {
2    public int trap(int[] nums) {
3        
4        int left = 0, right = nums.length - 1;
5        int leftMax = 0, rightMax = 0;
6        int water = 0;
7
8        while (left <= right) {
9            if (nums[left] <= nums[right]) {
10                leftMax = Math.max(leftMax, nums[left]);
11                water += leftMax - nums[left];
12                left++;
13            } else {
14                rightMax = Math.max(rightMax, nums[right]);
15                water += rightMax - nums[right];
16                right--;
17            }
18        }
19
20        return water;
21    }
22}