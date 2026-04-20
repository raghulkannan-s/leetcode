// Last updated: 4/20/2026, 7:40:18 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        
4        ArrayDeque<Integer> q = new ArrayDeque<>();
5        int n = nums.length;
6        int[] ans = new int[n-k+1];
7
8        for( int i = 0; i < n; i++ ){
9
10            if(!q.isEmpty() && q.peekFirst() == i-k ){
11                q.pollFirst();
12            }
13            while( !q.isEmpty() && nums[ q.peekLast() ] < nums[i]){
14                q.pollLast();
15            }
16
17            q.addLast(i);
18
19            if( i+1 >= k ){
20                ans[i+1-k] = nums[q.peekFirst()];
21            }
22        }
23
24        return ans;
25
26
27
28    }
29}