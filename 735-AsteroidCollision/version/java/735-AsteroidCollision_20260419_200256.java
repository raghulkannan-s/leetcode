// Last updated: 4/19/2026, 8:02:56 PM
1class Solution {
2    public int[] asteroidCollision(int[] nums) {
3        
4        int n = nums.length;
5        Stack<Integer> st = new Stack<>();
6
7        for( int a : nums ){
8        boolean dest = false;
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
21                else{
22                    dest = true;
23                    break;
24                }
25            }
26
27            if(!dest){
28                st.push(a);
29            }
30        }
31
32        int[] res = new int[st.size()];
33        int i = st.size()-1;
34        while( !st.isEmpty() ){
35            res[i--] = st.pop();
36        }
37
38        return res;
39    }
40}