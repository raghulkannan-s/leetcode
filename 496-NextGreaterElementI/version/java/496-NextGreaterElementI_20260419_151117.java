// Last updated: 4/19/2026, 3:11:17 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3
4        int n = nums2.length;
5        int m = nums1.length;
6
7        Stack<Integer> st = new Stack<>();
8        Map<Integer, Integer> map = new HashMap<>();
9
10        int[] res = new int[m];
11
12        for( int i = n-1; i >= 0; i-- ){
13
14            while( !st.isEmpty() && nums2[st.peek()] <= nums2[i] ){
15                st.pop();
16            }
17
18            int val = (st.isEmpty()) ? -1 : st.peek();
19            if(val!=-1) map.put( nums2[i], nums2[val] );
20            else map.put( nums2[i], -1 );
21            st.push(i);
22
23        }
24
25        for( int i = 0; i < m; i++ ){
26            res[i] = map.get(nums1[i]);
27        }
28
29        return res;
30    }
31}