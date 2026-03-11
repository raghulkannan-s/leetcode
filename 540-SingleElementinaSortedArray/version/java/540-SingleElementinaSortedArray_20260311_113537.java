// Last updated: 3/11/2026, 11:35:37 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        
4        int left = 0;
5        int right = nums.length-1;
6
7        while( left < right ){
8
9            int mid  = left + (right-left)/2;
10
11             if((mid == 0 || nums[mid] != nums[mid-1]) &&
12               (mid == nums.length-1 || nums[mid] != nums[mid+1]))
13                return nums[mid];
14
15            if( mid < right && nums[mid] == nums[mid+1] ){
16
17                if( mid%2 == 1 ){
18                    right = mid-1;
19                }else{
20                    left = mid+2;
21                }
22            }
23            else if( mid > left && nums[mid] == nums[mid-1] ){
24                if( mid%2 == 1 ){
25                    left = mid+1;
26                }else{
27                    right = mid-2;
28                }
29            }
30        }
31        return nums[left];
32    }
33}