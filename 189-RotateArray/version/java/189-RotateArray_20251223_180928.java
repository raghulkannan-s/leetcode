// Last updated: 12/23/2025, 6:09:28 PM
1class Solution {
2
3    void reverse(int[] nums, int left, int right){
4        while( left < right ){
5            int temp = nums[left];
6            nums[left] = nums[right];
7            nums[right] = temp;
8            left++;right--;
9        }
10    }
11
12    public void rotate(int[] nums, int k) {
13        
14        int n = nums.length;
15        k = k % n;
16
17        reverse( nums, 0, n-1 );
18        reverse( nums, 0, k-1 );
19        reverse( nums, k, n-1 );
20
21
22    }
23    
24}