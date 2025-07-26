// Last updated: 7/27/2025, 12:05:45 AM
class MinStack {
    
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if ( minStack.isEmpty() || val <= minStack.peek() ){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int popped = mainStack.pop();
        if( popped == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
       return mainStack.peek();
    }
    
    public int getMin() {
       return minStack.peek();
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