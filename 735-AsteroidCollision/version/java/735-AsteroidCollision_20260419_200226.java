// Last updated: 4/19/2026, 8:02:26 PM
1class Solution {
2    public int[] asteroidCollision(int[] nums) {
3        Stack<Integer> st = new Stack<>();
4        for( int a : nums ){
5            boolean dest = false;
6            while( !st.isEmpty() && st.peek() > 0 && a < 0 ){
7                if( st.peek() < -a ) st.pop();
8                else if( st.peek() == -a ){
9                    dest = true;
10                    st.pop();
11                    break;
12                }
13                else{
14                    dest = true;
15                    break;
16                }
17            }
18            if(!dest){
19                st.push(a);
20            }
21        }
22        int[] res = new int[st.size()];
23        int i = st.size()-1;
24        while( !st.isEmpty() ){
25            res[i--] = st.pop();
26        }
27        return res;
28    }
29}