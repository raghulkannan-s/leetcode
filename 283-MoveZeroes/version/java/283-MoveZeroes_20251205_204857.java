// Last updated: 12/5/2025, 8:48:57 PM
1class Solution {
2
3    public void moveZeroes(int[] nums) {
4        
5        int slow = 0;
6
7        for ( int fast = 0; fast < nums.length; fast++ ){
8            if( nums[fast] != 0){
9                int temp = nums[fast];
10                nums[fast] = nums[slow];
11                nums[slow] = temp;
12                slow++;
13            }
14        }
15
16    }
17}