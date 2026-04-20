// Last updated: 4/20/2026, 7:17:07 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int[] res = new int[m];
8
9        int max = 0;
10
11        for( int i = 0; i < n; i++){
12            for( int j = 0; j < m; j++ ){
13                int curr = matrix[i][j] - '0';
14                if( curr == 1 ){
15                    res[j] = res[j] + 1;
16                }else{
17                    res[j] = 0;
18                }
19            }
20            max = Math.max(max, histo(res));
21        }
22        return max;
23
24    }
25
26    public int histo( int[] h ){
27         
28        int n = h.length;
29
30        Stack<Integer> st = new Stack<>();
31        int maxArea = 0;
32        int[] nse = new int[n];
33        int[] pse = new int[n];
34
35        for( int i = 0; i < n; i++ ){
36
37            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
38                st.pop();
39            }
40            pse[i] = ( st.isEmpty() ) ? -1 : st.peek();
41            st.push(i);
42
43        }
44        st.clear();
45
46        for( int i = n-1; i >= 0; i-- ){
47
48            while( !st.isEmpty() && h[st.peek()] >= h[i] ){
49                st.pop();
50            }
51            nse[i] = ( st.isEmpty() ) ? n : st.peek();
52            st.push(i);
53
54            maxArea = Math.max( (nse[i] - pse[i] - 1) * h[i] , maxArea );
55        }
56
57        return maxArea;
58
59    }
60}