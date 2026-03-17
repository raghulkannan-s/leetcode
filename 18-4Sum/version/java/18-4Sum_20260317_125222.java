// Last updated: 3/17/2026, 12:52:22 PM
1
2class Solution {
3    public List<List<Integer>> fourSum(int[] nums, int target) {
4        
5        List<List<Integer>> res = new ArrayList<>();
6        int n = nums.length;
7
8        Arrays.sort(nums);
9
10        for (int i = 0; i < n - 3; i++) {
11
12            if (i > 0 && nums[i] == nums[i - 1]) continue;
13            for (int j = i + 1; j < n - 2; j++) {
14                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
15
16                int left = j + 1, right = n - 1;
17
18                while (left < right) {
19
20                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
21
22                    if (sum == target) {
23                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
24
25                        left++;
26                        right--;
27                       
28                        while (left < right && nums[left] == nums[left - 1]) left++;
29                        while (left < right && nums[right] == nums[right + 1]) right--;
30
31                    } else if (sum < target) {
32                        left++;
33                    } else {
34                        right--;
35                    }
36                }
37            }
38        }
39
40        return res;
41    }
42}