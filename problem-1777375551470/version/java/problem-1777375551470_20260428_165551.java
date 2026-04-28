// Last updated: 4/28/2026, 4:55:51 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> result = new ArrayList<>();
5
6        for( int i = 0; i<nums.length-2; i++ ){
7            if( i > 0 && nums[i] == nums[i-1] ) continue;
8            int left = i+1;
9            int right = nums.length-1;
10
11            while( left < right ){
12                int sum = nums[i] + nums[right] + nums[left];
13                if( sum == 0 ) {
14                    result.add(Arrays.asList( nums[i], nums[right], nums[left] ));
15
16                    left++;
17                    right--;
18
19                    while( left < right && nums[right] == nums[right+1] ) right--;
20                    while( left < right && nums[left] == nums[left-1] ) left++;
21                }
22                else if( sum < 0 ) left++;
23                else right--;
24                
25            }
26        }
27        return result;
28
29    }
30}