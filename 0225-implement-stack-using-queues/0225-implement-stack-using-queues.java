class MyStack {

    Queue<Integer> stk=new LinkedList<>();
    
    public MyStack() {
    }
    
    public void push(int x) {
        stk.add(x);
       int size = stk.size();
        // rotate so the newly added element moves to the front
        for (int i = 0; i < size - 1; i++) {
            stk.add(stk.poll());
        }
    }
    
    public int pop() {
        
        return stk.poll();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */