// Last updated: 6/9/2026, 12:46:30 PM
1class Solution {
2    public int maxArea(int[] height) {
3        
4        int max = 0;
5        int n = height.length;
6
7        int left = 0;
8        int right = n-1;
9
10        while( left < right ){
11
12            int curr = (right-left) * Math.min( height[left], height[right] ) ;
13            
14            max = Math.max( max, curr );
15            if(height[left] < height[right]) left++;
16            else right--;
17            
18        }
19        return max;
20
21
22    }
23}