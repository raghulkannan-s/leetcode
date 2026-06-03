// Last updated: 6/3/2026, 1:04:08 PM
1class Solution {
2    public int largestRectangleArea(int[] h) {
3        
4        int n = h.length;
5
6        Stack<Integer> st = new Stack<>();
7        int maxArea = 0;
8        
9        int[] pse = new int[n];
10        int[] nse = new int[n];
11
12        for( int i = 0; i < n; i++ ){
13
14            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
15                st.pop();
16            }
17            pse[i] = ( st.isEmpty() ) ? -1 : st.peek();
18            st.push(i);
19        }
20        
21        st.clear();
22
23        for( int i = n-1; i >= 0; i-- ){
24
25            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
26                st.pop();
27            }
28            nse[i] = ( st.isEmpty() ) ? n : st.peek();
29            st.push(i);
30
31            maxArea = Math.max( (nse[i] - pse[i] - 1) * h[i] , maxArea );
32        }
33
34        return maxArea;
35
36    }
37}