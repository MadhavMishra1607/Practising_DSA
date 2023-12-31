class MyQueue {
    Stack<Integer> q1 = new Stack();
    Stack<Integer> q2 = new Stack();
    
    
    public void push(int x) {
        q1.push(x);
    }
    
    public int pop() {
        while(!q1.isEmpty()){
            q2.push(q1.pop());
        }
        int popped = q2.pop();
        
        while(!q2.isEmpty()){
            q1.push(q2.pop());
        }
        return popped;
    }
    
    public int peek() {
        while(!q1.isEmpty()){
            q2.push(q1.pop());
        }
        int peeked = q2.peek();
        while(!q2.isEmpty()){
            q1.push(q2.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
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
