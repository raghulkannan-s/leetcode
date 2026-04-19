// Last updated: 4/19/2026, 7:59:17 PM
1class Solution {
2    public int[] asteroidCollision(int[] nums) {
3        
4        int n = nums.length;
5        Stack<Integer> st = new Stack<>();
6
7        for( int a : nums ){
8            boolean dest = false;
9            while( !st.isEmpty() && st.peek() > 0 && a < 0 ){
10                
11                if( st.peek() < -a ){
12                    st.pop();
13                }
14
15                else if( st.peek() == -a ){
16                    dest = true;
17                    st.pop();
18                    break;
19                }
20                else{
21                    dest = true;
22                    break;
23                }
24            }
25
26            if(!dest){
27                st.push(a);
28            }
29        }
30
31        int[] res = new int[st.size()];
32        int i = st.size()-1;
33        while( !st.isEmpty() ){
34            res[i--] = st.pop();
35        }
36
37        return res;
38    }
39}