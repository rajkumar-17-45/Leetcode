class CustomStack {
    int stack[];
    int top=-1;
    int max;
    public CustomStack(int maxSize) {
        stack=new int[maxSize];
        max=maxSize;
    }
    
    public void push(int x) {
        if(top<max-1)
        stack[++top]=x;
        // System.out.println(stack.length);
    }
    
    public int pop() {
        if(top!=-1)
        return stack[top--];
        return -1;  
    }
    
    public void increment(int k, int val) {
        if(top<k)
        {
         for(int i=0;i<=top;i++)
        {
            stack[i]=stack[i]+val;
        }
        }
        else
        {
        for(int i=0;i<k;i++)
        {
            stack[i]=stack[i]+val;
        }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */