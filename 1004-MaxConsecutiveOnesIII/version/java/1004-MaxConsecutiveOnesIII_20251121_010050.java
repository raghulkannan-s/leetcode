// Last updated: 11/21/2025, 1:00:50 AM

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for ( int num : nums ){
            sum+=num;
            int target = sum - k;

            if ( map.containsKey(target) ){
                count+= map.get(target);
            }

            map.put( sum, map.getOrDefault( sum, 0 )+1 );
        }

        return count;


    }
}