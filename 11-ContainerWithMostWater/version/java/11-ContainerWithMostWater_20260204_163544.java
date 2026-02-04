// Last updated: 2/4/2026, 4:35:44 PM
1class Solution {
2    public int maxArea(int[] height) {
3        
4        int max = 0;
5
6        int left = 0;
7        int right = height.length-1;
8
9        while( left < right ){
10            int w = right-left;
11            int h = Math.min(height[left], height[right]);
12            int vol = h*w;
13
14            if( vol > max ) max = vol;
15
16            if( height[left] < height[right] ){
17                left++;
18            }else{
19                right--;
20            }
21
22        }
23
24
25        return max;
26
27    }
28}