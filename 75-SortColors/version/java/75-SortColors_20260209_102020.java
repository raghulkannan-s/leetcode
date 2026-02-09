// Last updated: 2/9/2026, 10:20:20 AM
1class Solution {
2
3    public void sortColors(int[] nums) {
4        
5
6        int left = 0;
7        int right = nums.length-1;
8        int i = 0;
9    
10        while( i<=right ){
11            
12                if( nums[i] == 0 ){
13                    swap(nums, left, i);
14                    left++;
15                    i++;
16                }
17                else if( nums[i] == 2 ){
18                    swap(nums, i, right);
19                    right--;
20                }
21                else{
22                    i++;
23                }
24               
25        }        
26
27    }
28
29
30    public void swap ( int[] nums, int left, int right){
31        int temp =  nums[left];
32        nums[left] = nums[right];
33        nums[right] = temp;
34    }
35}