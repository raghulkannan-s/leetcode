// Last updated: 11/20/2025, 12:37:09 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, left = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            total+=nums[i];
        }
        
        for(int i = 0; i < n; i++){
            int right = total - left - nums[i];
            if(right == left) return i;
            left += nums[i];
        }

        return -1;




        
    }
}