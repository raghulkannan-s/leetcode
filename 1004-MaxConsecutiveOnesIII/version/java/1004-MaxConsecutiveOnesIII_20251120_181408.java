// Last updated: 11/20/2025, 6:14:08 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
       int left = 0;
       int zeros = 0;
       int max = 0;


        for ( int right = 0; right<nums.length; right++ ){

            if( nums[right] == 0  ){
                zeros++;
            }

            while(zeros > k){
                if( nums[left] == 0 ){
                    zeros--;
                }
                left++;
            }

            if( (right-left+1) > max ) max = right-left+1;

        }

        return max;
    }
}