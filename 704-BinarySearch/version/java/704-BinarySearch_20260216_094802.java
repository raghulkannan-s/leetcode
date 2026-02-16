// Last updated: 2/16/2026, 9:48:02 AM
1class Solution {
2    public int search(int[] nums, int target) {
3       
4        int start = 0;
5        int end = nums.length-1;
6
7        while( start <= end ){
8
9            int mid = start+(end - start)/2;
10
11            if( nums[mid] == target ){
12                return mid;
13            }
14            else if( nums[mid] > target  ){
15                end = mid-1;
16            }
17            else{
18                start = mid+1;
19            }
20            
21        }
22        return -1;
23    }
24}