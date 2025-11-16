// Last updated: 11/16/2025, 4:55:43 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length-1;

        while( low < high ){
            int mid = low + (high-low)/2;
    
            if ( nums[mid] < nums[mid+1]  ) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}