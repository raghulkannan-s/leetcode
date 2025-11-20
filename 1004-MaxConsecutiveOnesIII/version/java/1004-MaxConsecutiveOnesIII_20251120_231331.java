// Last updated: 11/20/2025, 11:13:31 PM
class Solution {

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0, mid = 0, right = n-1;

        while ( mid <= right ){
            if( nums[mid] == 0 ) {
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else if ( nums[mid] == 1){
                mid++;
            }
            else if (nums[mid] == 2 ){
                swap(nums, mid, right);
                right--;
            }
        }

    }
}