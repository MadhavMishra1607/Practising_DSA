class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) {
        q2.add(x);
        while(q1.size()>0){
            q2.add(q1.remove());
        }
        while(q2.size()>0){
            q1.add(q2.remove());
        }
        

    }
    
    public int pop() {
        int removing = q1.remove();
        return removing;
    }
    
    public int top() {
        int top_element = q1.peek();
        return top_element;
    }
    
    public boolean empty() {
        if(q1.size()==0){
            return true;
        }
        return false;
    }
}
