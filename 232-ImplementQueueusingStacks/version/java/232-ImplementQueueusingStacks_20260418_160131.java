// Last updated: 4/18/2026, 4:01:31 PM
1class MyQueue {
2    Stack<Integer> st;
3    Stack<Integer> temp;
4    
5    public MyQueue() {
6        st = new Stack<>();
7        temp = new Stack<>();
8    }
9    
10    public void push(int x) {
11        while( !st.empty() ){
12            temp.push(st.pop());
13        }
14        st.push(x);
15        while( !temp.empty() ){
16            st.push(temp.pop());
17        }
18    }
19    
20    public int pop() {
21        return st.pop();
22    }
23    
24    public int peek() {
25        return st.peek();        
26    }
27    
28    public boolean empty() {
29        return st.empty();
30    }
31}
32
33/**
34 * Your MyQueue object will be instantiated and called as such:
35 * MyQueue obj = new MyQueue();
36 * obj.push(x);
37 * int param_2 = obj.pop();
38 * int param_3 = obj.peek();
39 * boolean param_4 = obj.empty();
40 */