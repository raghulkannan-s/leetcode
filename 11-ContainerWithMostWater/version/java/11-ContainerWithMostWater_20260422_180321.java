// Last updated: 4/22/2026, 6:03:21 PM
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
12            int min = Math.min( height[left], height[right] );
13            int curr = (right-left) * min ;
14            max = Math.max( max, curr );
15
16            if(height[left] < height[right]) left++;
17            else right--;
18            
19        }
20        return max;
21
22
23    }
24}