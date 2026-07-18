class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;
    int m;
    
    

    public MinStack() {
        s=new Stack<>();
        min=new Stack<>(); 
        m=Integer.MAX_VALUE;   
                  
        
    }
    
    public void push(int value) {
        s.push(value);
        if(value<m){
            m=value;
            min.push(value);
        }else{
            min.push(m);
        }

        
    }
    
    public void pop() {
        s.pop();
        min.pop();
        if (min.isEmpty()) {
        m = Integer.MAX_VALUE;
    } else {
        m = min.peek();
    }
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */