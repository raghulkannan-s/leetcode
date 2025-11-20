// Last updated: 11/20/2025, 12:08:52 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double currSum = 0;

        for ( int i = 0; i < k; i++ ){
            currSum += nums[i];
        }

        double maxSum = currSum;

        for ( int i = k; i < n; i++ ){
            currSum = currSum + nums[i];
            currSum = currSum - nums[i-k];

            if( currSum > maxSum ) maxSum = currSum;
    
        }

        return maxSum/k;

    }
}