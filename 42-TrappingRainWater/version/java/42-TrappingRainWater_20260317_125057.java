// Last updated: 3/17/2026, 12:50:57 PM
1class Solution {
2    public int trap(int[] height) {
3        
4        int left = 0, right = height.length - 1;
5        int leftMax = 0, rightMax = 0;
6        int water = 0;
7
8        while (left <= right) {
9
10            if (height[left] <= height[right]) {
11                if (height[left] >= leftMax) {
12                    leftMax = height[left];
13                } else {
14                    water += leftMax - height[left];
15                }
16                left++;
17            } else {
18                if (height[right] >= rightMax) {
19                    rightMax = height[right];
20                } else {
21                    water += rightMax - height[right];
22                }
23                right--;
24            }
25        }
26
27        return water;
28    }
29}