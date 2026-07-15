class MyQueue {
    Stack<Integer> sk1= new Stack<>();
    Stack<Integer> sk2= new Stack<>();
    public MyQueue() {
    }
    
    public void push(int x) {
        sk1.push(x);
    }
    
    public int pop() {
        
        if(sk2.isEmpty())
        {
            while(!sk1.isEmpty())
            {
                sk2.push(sk1.pop());
            }
        }
        return sk2.pop();
    }
    
    public int peek() {
        if(sk2.isEmpty())
        {
            while(!sk1.isEmpty())
            {
                sk2.push(sk1.pop());
            }
        }
        return sk2.peek();
    }
    
    public boolean empty() {
        if(sk1.isEmpty() && sk2.isEmpty())
        return true;

        else 
        return false;

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