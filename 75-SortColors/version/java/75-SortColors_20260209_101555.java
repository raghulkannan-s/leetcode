// Last updated: 2/9/2026, 10:15:55 AM
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
15                }
16                if( nums[i] == 2 ){
17                    swap(nums, i, right);
18                    right--;
19                }
20                else{
21                    i++;
22                }
23               
24        }        
25
26    }
27
28
29    public void swap ( int[] nums, int left, int right){
30        int temp =  nums[left];
31        nums[left] = nums[right];
32        nums[right] = temp;
33    }
34}