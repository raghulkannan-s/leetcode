// Last updated: 6/3/2026, 4:21:00 PM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        
4        int n = arr.length;
5        int mod = (int)(1e9 + 7);
6        long max = 0;
7
8        int[] nse = new int[n];
9        int[] pse = new int[n];
10
11        Stack<Integer> st = new Stack<>();
12
13        for( int i = 0; i<n; i++ ){
14            while( !st.isEmpty() && arr[st.peek()] > arr[i] ){
15                st.pop();
16            }
17            pse[i] = (st.isEmpty()) ? -1 : st.peek();
18            st.push(i);
19        }
20
21        st.clear();
22
23        for( int i = n-1; i >=0; i-- ){
24            while( !st.isEmpty() && arr[st.peek()] >= arr[i] ){
25                st.pop();
26            }
27            nse[i] = (st.isEmpty()) ? n : st.peek();
28            st.push(i);
29        }
30
31        for( int i = 0; i < n; i++ ){
32            
33            int left = i-pse[i];
34            int right = nse[i]-i;
35
36            max = (max + ((long) left * right % mod) * arr[i]) % mod;
37
38        }
39
40        return (int)max;
41
42    }
43}