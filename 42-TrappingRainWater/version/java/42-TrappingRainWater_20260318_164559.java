// Last updated: 3/18/2026, 4:45:59 PM
1class Solution {
2    public int trap(int[] height) {
3        
4        int left = 0, right = height.length-1;
5        int water = 0;
6        int leftMax = 0, rightMax = 0;
7
8
9        while( left <= right ){
10
11            if( height[left] <= height[right] ){
12
13                if( height[left] > leftMax ){
14                    leftMax = height[left];
15                }else{
16                    water += leftMax - height[left];
17                }
18                left++;
19            }
20
21            else{
22
23                if( height[right] > rightMax ){
24                    rightMax = height[right];
25                }else{
26                    water += rightMax - height[right];
27                }
28                right--;
29            }
30
31        }
32
33        return water;
34    }
35}