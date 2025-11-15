// Last updated: 11/15/2025, 11:01:11 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for ( int i=0; i< nums.length; i++ ){
            int need = target - nums[i];

            if( seen.containsKey(need) ){
                return new int[] { seen.get(need) , i };
            }

            seen.put( nums[i], i );

        }

        return new int[]{};

    }
}