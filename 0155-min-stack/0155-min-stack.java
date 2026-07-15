class MinStack {
    int min;
    Stack<Integer[]> q;

    public MinStack() {
         q=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        min=Math.min(min,value);
        Integer var[]={value,min};
        q.push(var);
        
    }
    
    public void pop() {
        
        q.pop();
        if(q.size()==0) {
            min=Integer.MAX_VALUE;
            return;
        }
        min=q.peek()[1];
    }
    
    public int top() {
        return q.peek()[0];
    }
    
    public int getMin() {
        return q.peek()[1];
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