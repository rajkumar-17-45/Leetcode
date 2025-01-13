class Pair
{
    int val;
    int min;
    public Pair(int val,int min)
    {
        this.val=val;
        this.min=min;
    }
}
class MinStack {
 
    Stack<Pair> stack;
    public MinStack() {
        stack=new Stack<Pair>();
    }
    
    public void push(int val) {
         if(stack.isEmpty())
         {
             stack.push(new Pair(val,val));
         }
         else
         {
           int min=Math.min(stack.peek().min,val);
           stack.push(new Pair(val,min));
         }
    }
    
    public void pop() {
        if(!stack.isEmpty())
        {
            stack.pop();
        }
    }
    
    public int top() {
       return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
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