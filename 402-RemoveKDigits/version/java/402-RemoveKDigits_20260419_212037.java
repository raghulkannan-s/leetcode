// Last updated: 4/19/2026, 9:20:37 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        
4        Stack<Character> st = new Stack<>();
5        StringBuilder sb = new StringBuilder();
6
7        for( int i = 0; i < num.length(); i++ ){
8            char ch = num.charAt(i);
9            while( !st.isEmpty() && st.peek() > ch && k > 0 ){
10                    st.pop();
11                    k--;
12            }
13            st.push(ch);
14        }
15        while( !st.isEmpty() && k-- > 0){
16            st.pop();
17        }
18        while( !st.isEmpty() ){
19            sb.append(st.pop());
20        }
21        sb.reverse();
22
23        int i = 0;
24        while (i < sb.length() && sb.charAt(i) == '0') i++;
25        String res = sb.substring(i);
26        return (res.isEmpty()) ? "0" : res;
27
28    }
29}