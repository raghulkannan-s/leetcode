// Last updated: 7/26/2025, 11:37:07 PM
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