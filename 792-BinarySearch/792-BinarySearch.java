// Last updated: 7/26/2025, 11:36:36 PM
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while( low <= high ){
            int mid = Math.floorDiv( low + high , 2 );

            if( nums[mid] == target ){
                return mid;
            }
            else if( target < nums[mid] ){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}