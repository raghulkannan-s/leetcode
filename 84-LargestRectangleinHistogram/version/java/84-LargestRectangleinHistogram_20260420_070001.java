// Last updated: 4/20/2026, 7:00:01 AM
1class Solution {
2    public int largestRectangleArea(int[] h) {
3        
4        int n = h.length;
5
6        Stack<Integer> st = new Stack<>();
7        int maxArea = 0;
8        int[] nse = new int[n];
9        int[] pse = new int[n];
10
11        for( int i = 0; i < n; i++ ){
12
13            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
14                st.pop();
15            }
16            pse[i] = ( st.isEmpty() ) ? -1 : st.peek();
17            st.push(i);
18
19        }
20        st.clear();
21
22        for( int i = n-1; i >= 0; i-- ){
23
24            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
25                st.pop();
26            }
27            nse[i] = ( st.isEmpty() ) ? n : st.peek();
28            st.push(i);
29
30            maxArea = Math.max( (nse[i] - pse[i] - 1) * h[i] , maxArea );
31        }
32
33        return maxArea;
34
35    }
36}