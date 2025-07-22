// Last updated: 7/22/2025, 9:33:45 AM
// Used Hashset and Java implementation of contains duplicate
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