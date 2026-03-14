// Last updated: 3/14/2026, 11:40:40 PM
1class Solution {
2    public int[] frequencySort(int[] nums) {
3
4        Map<Integer, Integer> freq = new HashMap<>();
5
6        for (int num : nums) {
7            freq.put(num, freq.getOrDefault(num, 0) + 1);
8        }
9
10        Integer[] arr = new Integer[nums.length];
11        for (int i = 0; i < nums.length; i++) {
12            arr[i] = nums[i];
13        }
14
15        Arrays.sort(arr, (a, b) -> {
16            if (freq.get(a).equals(freq.get(b))) {
17                return b - a;
18            }
19            return freq.get(a) - freq.get(b);
20        });
21
22        for (int i = 0; i < nums.length; i++) {
23            nums[i] = arr[i];
24        }
25
26        return nums;
27    }
28}
29