// Last updated: 7/26/2025, 11:36:43 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums){
            if( seen.contains(num) ) return true;
            seen.add(num);
        }
        return false;
    }
}