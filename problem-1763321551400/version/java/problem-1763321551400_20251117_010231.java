// Last updated: 11/17/2025, 1:02:31 AM
class Solution {
    public int countHillValley(int[] nums) {
        
        int n = 0;

        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for ( int i = 1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]) list.add(nums[i]);
        }


        for (int i = 1; i<list.size()-1; i++){
            int prev = list.get(i-1);
            int curr = list.get(i);
            int next = list.get(i+1);

            if ( ( prev < curr && curr > next ) || ( prev > curr && curr < next ) ) n++;
        }

        return n;

    }
}