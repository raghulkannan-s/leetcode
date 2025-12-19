// Last updated: 12/20/2025, 2:00:00 AM
1class Solution {
2
3    private void swap(int[] nums, int i, int j) {
4        int temp = nums[i];
5        nums[i] = nums[j];
6        nums[j] = temp;
7    }
8
9    public void sortColors(int[] nums) {
10        int n = nums.length;
11        int left = 0, mid = 0, right = n-1;
12
13        while ( mid <= right ){
14            if( nums[mid] == 0 ) {
15                swap(nums, mid, left);
16                left++;
17                mid++;
18            }
19            else if ( nums[mid] == 1){
20                mid++;
21            }
22            else if (nums[mid] == 2 ){
23                swap(nums, mid, right);
24                right--;
25            }
26        }
27
28    }
29}