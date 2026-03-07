// Last updated: 3/7/2026, 12:20:49 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        
4        Arrays.sort(nums);
5
6        if( nums.length == 0 ) return 0;
7
8        int count = 0;
9        int curr = 0;
10
11        for( int i = 0; i<nums.length-1; i++ ){
12            if( nums[i] == nums[i+1] ) continue;
13            else if( nums[i]+1 == (nums[i+1]) ){
14                curr++;
15            }else{
16                curr = 0;
17            }
18            count = Math.max(count, curr);
19        }
20
21        return count+1;
22    }
23}