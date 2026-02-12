// Last updated: 2/12/2026, 9:50:23 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        
4        int count = 0;
5        int can = nums[0];
6
7
8        for ( int i = 0; i<nums.length; i++ ){
9
10            if( can == nums[i] ){
11                count++;
12            }else{
13                count--;
14            }
15
16
17            if( count == 0 ){
18                can = nums[i];
19                count++;
20            }
21
22        }
23
24        return can;
25
26    }
27}