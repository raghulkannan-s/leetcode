// Last updated: 4/19/2026, 4:33:51 PM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3
4        int mod = (int)(1e9 + 7);
5        int n = arr.length;
6
7        int[] nse = new int[n];
8        int[] pse = new int[n];
9
10        Stack<Integer> st = new Stack<>();
11
12        for( int i = n-1; i >= 0; i--){
13
14            while( !st.isEmpty() && arr[st.peek()] > arr[i] ){
15                st.pop();
16            }
17            nse[i] = ( st.isEmpty() )? n : st.peek();
18            st.push(i);
19        }
20
21        st.clear();
22
23        for( int i = 0; i < n; i++){
24
25            while( !st.isEmpty() && arr[st.peek()] >= arr[i] ){
26                st.pop();
27            }
28            pse[i] = ( st.isEmpty() )? -1: st.peek();
29            st.push(i);
30
31        }
32
33        long sum = 0;
34
35        for( int i = 0; i < n; i++ ){
36
37            long left = i - pse[i]; 
38            long right = nse[i] - i;
39
40            sum = (sum + (arr[i] * left * right)) % mod ;
41        }
42
43        return (int) sum;
44
45    }
46}