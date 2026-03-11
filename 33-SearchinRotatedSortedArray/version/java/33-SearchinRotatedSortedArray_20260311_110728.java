// Last updated: 3/11/2026, 11:07:28 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        
4        int n = nums.length;
5        int left = 0;
6        int right = n-1;
7
8
9        while( left <= right ){
10
11            int mid = left + ( right - left )/2;
12
13            if( nums[mid] == target ) return mid;
14
15            else if( nums[left] <= nums[mid] ){
16
17                if( target >= nums[left] && target < nums[mid] ){
18                    right = mid-1;
19                }
20                else{
21                    left = mid+1;
22                }
23            }
24
25            else{ 
26                if( target <= nums[right] && target > nums[mid] ){
27                    left = mid+1;
28                }
29                else{
30                    right = mid-1;
31                }
32            }
33
34
35        }
36        return -1;
37
38    }
39}