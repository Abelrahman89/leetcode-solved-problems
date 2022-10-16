package stack;

import java.util.Stack;

class MinStack {

    Stack<Integer> data;

    Stack<Integer>minStack;

    public MinStack() {
        data = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        data.push(val);

        val = Math.min(val,minStack.isEmpty()? val : minStack.peek());
        minStack.push(val);

    }

    public void pop() {
        data.pop();
        minStack.pop();
    }

    public int top() {
        return data.peek();
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