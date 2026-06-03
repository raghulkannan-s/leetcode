// Last updated: 6/3/2026, 1:27:57 PM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        
4        Stack<Integer> st = new Stack<>();
5
6        for( int a : asteroids ){
7
8            boolean dest = false;
9
10            while( !st.isEmpty() && st.peek() > 0 && a < 0 ){
11
12                if( st.peek() < -a ){
13                    st.pop();
14                }
15
16                else if( st.peek() == -a ){
17                    dest = true;
18                    st.pop();
19                    break;
20                }
21
22                else{
23                    dest = true;
24                    break;
25                }
26
27            }
28            if( !dest ) st.push(a);
29
30        }
31
32        int[] res = new int[st.size()];
33
34        for( int i = st.size()-1; i >= 0 ; i-- ){
35            res[i] = st.pop();
36        }
37
38        return res;
39
40
41    }
42}