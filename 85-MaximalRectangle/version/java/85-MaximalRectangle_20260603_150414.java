// Last updated: 6/3/2026, 3:04:14 PM
1class Solution {
2    public int maximalRectangle(char[][] mat) {
3
4        int n = mat.length;
5        int m = mat[0].length;
6
7        int max = 0;
8
9        int[] res = new int[m];
10        
11        for( int i = 0; i < n; i++){
12            for( int j = 0; j < m; j++ ){
13                int curr = mat[i][j] - '0';
14                if( curr == 1 ){
15                    res[j] = res[j] + 1 ;
16                }
17                else{
18                    res[j] = 0;
19                }
20            }
21            max = Math.max( max, histogram(res) );
22        }
23
24        return max;
25    }
26
27    public int histogram( int[] h ){
28
29        int n = h.length;
30
31        Stack<Integer> st = new Stack<>();
32
33        int max = 0;
34
35        int[] pse = new int[n];
36        int[] nse = new int[n];
37
38        for( int i = 0; i < n; i++ ){
39            while( !st.isEmpty() && h[st.peek()] >= h[i] ) {
40                st.pop();
41            }
42            pse[i] = (st.isEmpty()) ? -1 : st.peek();
43            st.push(i);
44        }
45        st.clear();
46
47        for( int i = n-1; i >= 0; i-- ){
48            while( !st.isEmpty() && h[st.peek()] >= h[i] ) {
49                st.pop();
50            }
51            nse[i] = (st.isEmpty()) ? n : st.peek();
52            st.push(i);
53
54            max = Math.max( max, (nse[i]-pse[i]-1) * h[i] );
55        }
56
57        return max;
58        
59
60    }
61} 