// Last updated: 11/19/2025, 1:28:39 AM
class Solution {
    public int removeElement(int[] nums, int val) {

        int write = 0;

        for ( int read = 0; read < nums.length; read++){
            if( nums[read] != val ){
                nums[write] = nums[read];
                write++;
            }
        }
        return write;

    }
}