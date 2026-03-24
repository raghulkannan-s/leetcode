// Last updated: 3/24/2026, 11:51:35 PM
1class Solution {
2    public boolean check(int[] nums) {
3        boolean flag = false;
4
5        for(int i = 0; i < nums.length; i++){
6            if(nums[(i+1) % nums.length] < nums[i]){
7                if(flag){
8                    return false;
9                }
10                flag = true;
11            }
12        }
13        return true;
14    }
15}