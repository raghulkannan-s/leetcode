// Last updated: 3/16/2026, 9:17:10 AM
1class Solution {
2    public boolean validMountainArray(int[] nums) {
3        
4        boolean turn = false;
5        boolean wentUp = false;
6
7        if (nums.length < 3) return false;
8
9        for( int i = 1; i < nums.length; i++ ){
10
11            if( turn == false ){
12                if( (nums[i]-nums[i-1])>0 ){
13                    wentUp = true;
14                    continue;
15              } else if (nums[i] - nums[i-1] < 0) {
16                    turn = true;
17                }else{
18                    return false;
19                }
20            } else{
21                if( (nums[i]-nums[i-1])<0 ){
22                    continue;
23                }else{
24                    return false;
25                }
26            }
27        }
28        return turn && wentUp;
29    }
30}