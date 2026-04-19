// Last updated: 4/19/2026, 3:27:04 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        
4        int n = nums.length;
5
6        Stack<Integer> st = new Stack<>();
7        int[] arr = new int[n];
8
9        for( int i = 2*n-1; i>=0; i--){
10
11            while( !st.isEmpty() && nums[st.peek()] <= nums[i%n] ) {
12                st.pop();
13            }
14
15            if( i < n ) {
16                arr[i] = (st.isEmpty()) ? -1 : nums[st.peek()];
17            }
18            
19            st.push(i%n);
20
21        }
22        return arr;
23    }
24}