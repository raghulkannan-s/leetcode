// Last updated: 11/20/2025, 6:19:51 AM
class MinStack {

    Stack<Integer> stack = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        this.stack.push(val);
    }
    
    public void pop() {
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for ( int i : stack ){
            if ( i < min ){
                min = i;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */