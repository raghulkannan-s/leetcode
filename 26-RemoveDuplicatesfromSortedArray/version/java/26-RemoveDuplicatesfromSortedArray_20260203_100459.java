// Last updated: 2/3/2026, 10:04:59 AM
1class Solution {
2
3    public void swap(int[] nums, int a, int b){
4        int temp = nums[a];
5        nums[a] = nums[b];
6        nums[b] = temp;
7    }
8
9    public int removeDuplicates(int[] nums) {
10        
11        int slow = 0;
12
13        for( int fast = 0; fast<nums.length; fast++ ){
14            while( fast<nums.length-1 && nums[fast] == nums[slow] ){
15                fast++;
16            }
17
18           if( nums[fast] != nums[slow] ){
19             slow++;
20             swap(nums, fast, slow);
21           }
22
23        }
24
25
26        return slow+1;
27    }
28}