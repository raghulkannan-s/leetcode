// Last updated: 11/20/2025, 12:25:21 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, len = 0, min = Integer.MAX_VALUE;
        int left = 0;
        int n = nums.length;

        for ( int right = 0; right<n; right++ ){

            sum += nums[right];
            len++;
            
            while( sum >= target ){
                if( len < min ) min = len;
                sum -= nums[left];
                left++;
                len--;
            }

        }
        
        if( min == Integer.MAX_VALUE ) return 0;
        return min;

    }
}