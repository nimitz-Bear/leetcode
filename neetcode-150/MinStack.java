class MinStack {
    /*
    have two stacks, one containing the actual value
    and one the minimum, before that element

    constructor:
    - initalize stack, minstack
    - push int.max_VALUE to minStack (as that is current min)

    push:
    - push new value to stack
    - update min if needed
    - always update minStack with min

    pop:
    - pop value from stack
    - pop value from minStack
    - set min = minStack.peek

    top:
    - stack.peek

    min:
    - minStack.peek
         */
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack= new Stack<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack.push(val);
        if (val < min) {
            min = val;
        }
        minStack.push(min);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        min = minStack.peek();
    }
    
    public int top() {
        return stack.peek();
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
