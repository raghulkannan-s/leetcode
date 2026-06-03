// Last updated: 6/3/2026, 3:07:48 PM
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
13                if( mat[i][j] == '1' ){
14                    res[j] = res[j] + 1 ;
15                }
16                else{
17                    res[j] = 0;
18                }
19            }
20            max = Math.max( max, histogram(res) );
21        }
22
23        return max;
24    }
25
26    public int histogram( int[] h ){
27
28        int n = h.length;
29
30        Stack<Integer> st = new Stack<>();
31
32        int max = 0;
33
34        int[] pse = new int[n];
35        int[] nse = new int[n];
36
37        for( int i = 0; i < n; i++ ){
38            while( !st.isEmpty() && h[st.peek()] >= h[i] ) {
39                st.pop();
40            }
41            pse[i] = (st.isEmpty()) ? -1 : st.peek();
42            st.push(i);
43        }
44        st.clear();
45
46        for( int i = n-1; i >= 0; i-- ){
47            while( !st.isEmpty() && h[st.peek()] >= h[i] ) {
48                st.pop();
49            }
50            nse[i] = (st.isEmpty()) ? n : st.peek();
51            st.push(i);
52
53            max = Math.max( max, (nse[i]-pse[i]-1) * h[i] );
54        }
55
56        return max;
57        
58
59    }
60} 