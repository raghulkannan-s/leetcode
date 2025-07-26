// Last updated: 7/27/2025, 12:32:01 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while( low < high ){
            int mid = low + (high-low) /2;
            if ( nums[mid] < target ) {
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}