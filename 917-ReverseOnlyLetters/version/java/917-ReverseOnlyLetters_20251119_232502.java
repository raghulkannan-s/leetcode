// Last updated: 11/19/2025, 11:25:02 PM
class Solution {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int curr = 0;

        for( int i = 0; i<nums.length; i++ ){
            curr += nums[i];
            
            if( curr > max ){
                max = curr;
            }
            if( curr < 0 ){
                curr = 0;
            }
        }
        return max;
    }
}