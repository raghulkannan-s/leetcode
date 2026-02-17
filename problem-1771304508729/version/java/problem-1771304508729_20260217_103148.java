// Last updated: 2/17/2026, 10:31:48 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        
4        int n = nums.length;
5
6        int start = 0;
7        int end = n-1;
8
9
10        while( start <= end ){
11
12            int mid = start + (end - start) / 2;            
13            if( nums[mid] == target ) return mid;
14
15            else if( nums[start] <= nums[mid] ){
16                if( target >= nums[start] && target < nums[mid] ){
17                    end = mid-1;
18                }else{
19                    start = mid+1;
20                }
21            }
22            else{
23                if( target <= nums[end] && target > nums[mid] ){
24                    start = mid+1;
25                }else{
26                    end = mid-1;
27                }
28            }
29
30        }
31
32        return -1;
33
34    }
35}