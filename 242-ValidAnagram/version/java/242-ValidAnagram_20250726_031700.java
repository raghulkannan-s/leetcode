// Last updated: 7/26/2025, 3:17:00 AM
// implemented in JAVA
class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for ( int j = 1; j < nums.length; j++){
            if( nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;

    }
}