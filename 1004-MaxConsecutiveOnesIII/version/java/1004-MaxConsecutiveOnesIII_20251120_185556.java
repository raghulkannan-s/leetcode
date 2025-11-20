// Last updated: 11/20/2025, 6:55:56 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for( int num : nums ){
            if( !seen.add( num ) ){
                return true;
            }
        }

        return false;
        
    }
}