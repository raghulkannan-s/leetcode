// Last updated: 7/26/2025, 3:24:21 AM
// implemented in Java, overwrite with two pointers
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0;

        for ( int j = 0; j < nums.length; j++ ){

            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }

        }

        return i;

    }
}