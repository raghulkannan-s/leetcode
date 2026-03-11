// Last updated: 3/11/2026, 2:16:21 PM
1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4
5        int near = 0;
6        int far = 0;
7        int jump = 0;
8
9        int farthest = 0;
10
11        while( far < n-1 ){
12
13            for( int j = near; j <= far; j++){
14                farthest = Math.max( nums[j] + j, farthest );
15            }
16            jump++;
17            near = far+1;
18            far = farthest;
19
20        }
21
22        return jump;
23
24
25    }
26}