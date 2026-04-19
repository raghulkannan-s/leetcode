// Last updated: 4/19/2026, 8:03:55 PM
1class Solution {
2    public int[] asteroidCollision(int[] nums) {
3        
4        Stack<Integer> st = new Stack<>();
5        
6        for( int a : nums ){
7            boolean dest = false;
8            while( !st.isEmpty() && st.peek() > 0 && a < 0 ){
9                if( st.peek() < -a ) st.pop();
10                else if( st.peek() == -a ){
11                    dest = true;
12                    st.pop();
13                    break;
14                }
15                else{
16                    dest = true;
17                    break;
18                }
19            }
20            if(!dest) st.push(a); 
21        }
22
23        int[] res = new int[st.size()];
24        int i = st.size()-1;
25        while( !st.isEmpty() ){
26            res[i--] = st.pop();
27        }
28
29        return res;
30    }
31}