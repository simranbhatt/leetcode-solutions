class MyQueue {

    Stack<Integer> stackQueue;
    Stack<Integer> reserveStack;

    public MyQueue() {
       stackQueue = new Stack<>();
        reserveStack = new Stack<>();
       
    }
    
    public void push(int x) {
        while(!stackQueue.isEmpty())
            reserveStack.push(stackQueue.pop());
        
        stackQueue.push(x);
        while(!reserveStack.isEmpty())
            stackQueue.push(reserveStack.pop());
    }
    
    public int pop() {
        return stackQueue.pop();
    }
    
    public int peek() {
        return stackQueue.peek();
    }
    
    public boolean empty() {
        return stackQueue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */