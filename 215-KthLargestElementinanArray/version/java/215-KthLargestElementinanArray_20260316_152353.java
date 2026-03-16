// Last updated: 3/16/2026, 3:23:53 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3         
4        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
5
6        for (int num : nums) {
7            minHeap.offer(num);
8            if (minHeap.size() > k) {
9                minHeap.poll();
10            }
11        }
12
13        return minHeap.peek();
14    }
15}