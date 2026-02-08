// Last updated: 2/8/2026, 6:57:53 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int n = nums.length;
5
6        int i = n - 2;
7
8        while (i >= 0 && nums[i] >= nums[i + 1]) {
9            i--;
10        }
11
12        if (i >= 0) {
13            int j = n - 1;
14
15            while (j >= 0 && nums[j] <= nums[i])
16                j--;
17
18            swap(nums, i, j);
19        }
20
21        reverse(nums, i + 1, n - 1);
22
23    }
24
25    public void swap(int[] nums, int i, int j) {
26        int temp = nums[i];
27        nums[i] = nums[j];
28        nums[j] = temp;
29    }
30
31    private void reverse(int[] nums, int left, int right) {
32        while (left < right) {
33            swap(nums, left++, right--);
34        }
35    }
36}