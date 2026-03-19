// Last updated: 3/20/2026, 1:36:59 AM
1class Solution {
2    public int heightChecker(int[] heights) {
3        
4        int[] init = heights.clone();
5        Arrays.sort(heights);
6
7        int count = 0;
8
9        for( int i = 0; i<heights.length; i++ )
10            if( heights[i] != init[i] ) count++;
11        
12
13        return count;
14
15    }
16}