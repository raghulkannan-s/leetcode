// Last updated: 4/18/2026, 4:54:52 PM
1class MinStack {
2
3    Stack<Integer> st;
4    Stack<Integer> min;
5
6    public MinStack() {
7        st = new Stack<>();
8        min = new Stack<>();
9    }
10    
11    public void push(int val) {
12        st.push(val);
13        if( min.isEmpty() ) min.push(val);
14        else min.push(Math.min(min.peek(), val));
15    }
16    
17    public void pop() {
18        st.pop();
19        min.pop();
20    }
21    
22    public int top() {
23        return st.peek();
24    }
25    
26    public int getMin() {
27        return min.peek();
28    }
29}
30
31/**
32 * Your MinStack object will be instantiated and called as such:
33 * MinStack obj = new MinStack();
34 * obj.push(val);
35 * obj.pop();
36 * int param_3 = obj.top();
37 * int param_4 = obj.getMin();
38 */