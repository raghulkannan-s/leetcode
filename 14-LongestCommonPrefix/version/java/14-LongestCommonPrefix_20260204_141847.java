// Last updated: 2/4/2026, 2:18:47 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        
4        int low = 0;
5        int high =  nums.length;
6
7
8        while( low < high ){
9
10            int mid = low+(high-low)/2;
11            if( target == nums[mid] ) return mid;
12            else if( target > nums[mid] ){
13                low = mid+1;
14            } else {
15                high = mid;
16            }
17
18        }
19
20
21        return low;
22
23    }
24}