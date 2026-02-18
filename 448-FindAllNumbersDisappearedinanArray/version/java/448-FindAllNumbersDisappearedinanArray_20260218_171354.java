// Last updated: 2/18/2026, 5:13:54 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        
4        List<Integer> res = new ArrayList<>();
5       
6        for( int i = 0; i<nums.length; i++ ){
7            if( nums[Math.abs(nums[i])-1] > 0 ){
8                nums[Math.abs(nums[i])-1] *= -1;
9            }
10        }
11
12        for( int i = 0; i<nums.length; i++ ){
13            if( nums[i] > 0 ){
14                res.add(i+1);
15            }
16        }
17
18        return res;
19
20    }
21}