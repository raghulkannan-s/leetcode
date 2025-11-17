// Last updated: 11/18/2025, 12:06:45 AM
class Solution {
    public int removeDuplicates(int[] nums) {

        int write = 1;

        for(int scan = 1; scan<nums.length; scan++){

            if( nums[scan] != nums[scan-1] ){
                nums[write] = nums[scan];
                write++;
            }

        }

        return write;
    }
}