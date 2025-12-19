// Last updated: 12/20/2025, 2:03:41 AM
1class Solution {
2
3    private void swap(int[] nums, int i, int j) {
4        int temp = nums[i];
5        nums[i] = nums[j];
6        nums[j] = temp;
7    }
8
9    public void sortColors(int[] nums) {
10        
11        int left = 0;
12        int right = nums.length-1;
13        int scan = 0;
14        
15        while ( scan <= right ){
16            if ( nums[scan] == 0 ){
17                swap(nums, left, scan);
18                left++;
19                scan++;
20            }
21            else if(nums[scan] == 1){
22                scan++;
23            }
24            else if ( nums[scan] == 2 ){
25                swap(nums, right, scan);
26                right--;
27            }
28        }
29
30    }
31}