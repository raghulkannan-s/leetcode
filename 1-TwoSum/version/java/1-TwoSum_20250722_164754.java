// Last updated: 7/22/2025, 4:47:54 PM
// Two sum implemented in Java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>();

        for ( int i = 0; i < nums.length; i++ ){
            int difference = target - nums[i];
            if( store.containsKey(difference) ){
                return new int[] { i, store.get(difference) } ;
            };
            store.put( nums[i], i );
        }
        return new int[] {-1, -1};
    }
}