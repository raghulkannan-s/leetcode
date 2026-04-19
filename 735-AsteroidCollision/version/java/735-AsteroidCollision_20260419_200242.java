// Last updated: 4/19/2026, 8:02:42 PM
1class Solution {
2    public int[] asteroidCollision(int[] nums) {
3        int n = nums.length;
4        Stack<Integer> st = new Stack<>();
5        for( int a : nums ){
6            boolean dest = false;
7            while( !st.isEmpty() && st.peek() > 0 && a < 0 ){
8                if( st.peek() < -a ) st.pop();
9                else if( st.peek() == -a ){
10                    dest = true;
11                    st.pop();
12                    break;
13                }
14                else{
15                    dest = true;
16                    break;
17                }
18            }
19            if(!dest){
20                st.push(a);
21            }
22        }
23        int[] res = new int[st.size()];
24        int i = st.size()-1;
25        while( !st.isEmpty() ){
26            res[i--] = st.pop();
27        }
28        return res;
29    }
30}