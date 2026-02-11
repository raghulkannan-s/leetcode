// Last updated: 2/11/2026, 10:37:30 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        
4        int n = nums.length;
5
6        int s = 0;
7        int e = n-1;
8
9        while( s < e ){
10
11
12            int mid = s + (e-s)/2;
13
14
15            if( nums[mid+1] >= nums[mid] ){
16                s = mid+1;
17            }
18            else{
19                e = mid;
20            }
21
22
23        }
24
25        return s;
26
27    }
28}