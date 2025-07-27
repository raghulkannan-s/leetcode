// Last updated: 7/27/2025, 3:42:24 PM
class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> filter = new ArrayList<>();

        filter.add(nums[0]);

        for(int i = 1; i<nums.length; i++){
            if( nums[i] != nums[i-1] ){
                filter.add(nums[i]);
            }
        }

        int count = 0;

        for ( int i = 1; i < filter.size()-1; i++ ){

            int prev = filter.get(i-1);
            int curr = filter.get(i);
            int next = filter.get(i+1);

            if( ( prev < curr && curr > next ) || ( prev > curr && curr < next )  ){
                count++;
            }

        }
        return count;
    }
}