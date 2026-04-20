// Last updated: 4/20/2026, 6:55:40 AM
1class Solution {
2    public int largestRectangleArea(int[] h) {
3        
4        int n = h.length;
5
6        Stack<Integer> st = new Stack<>();
7        int[] nse = new int[n];
8        int[] pse = new int[n];
9
10        for( int i = 0; i < n; i++ ){
11
12            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
13                st.pop();
14            }
15            pse[i] = ( st.isEmpty() ) ? -1 : st.peek();
16            st.push(i);
17
18        }
19        st.clear();
20
21        for( int i = n-1; i >= 0; i-- ){
22
23            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
24                st.pop();
25            }
26            nse[i] = ( st.isEmpty() ) ? n : st.peek();
27            st.push(i);
28
29        }
30
31        int maxArea = 0;
32
33        for( int i = 0; i < n; i++ ){
34
35            int width = nse[i] - pse[i] - 1;
36            int height = h[i];
37
38            int area = height * width;
39
40            maxArea = Math.max( area , maxArea );
41        }
42
43        return maxArea;
44
45    }
46}