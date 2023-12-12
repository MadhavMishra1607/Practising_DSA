class MinStack {
    Stack<Integer> s1  =new Stack<>();
    Stack<Integer> cache  =new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        s1.push(val);
        if(cache.isEmpty()){
            cache.push(val);
            return;
        }
        int min = cache.peek();
        if(min>val){
            cache.push(val);
        }
        else{
            cache.push(min);
        }
    }
    
    public void pop() {
        s1.pop();
        cache.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return cache.peek();
    }
}

