class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int a[]=new int[temperatures.length];
     Stack<Integer> s1=new Stack<Integer>();
     Stack<Integer> s2=new Stack<Integer>();
    s1.push(temperatures[0]);
    s2.push(0);
    for(int i=1;i<temperatures.length;i++)
    {
        while(!s1.isEmpty() && s1.peek()<temperatures[i])
        {
            int val=s2.peek();
            int y=i-val;
           a[s2.peek()]=y;
            s1.pop();
            s2.pop();
        }
        s1.push(temperatures[i]);
        s2.push(i);
    }
    while(!s1.isEmpty())
    {
       a[s2.pop()]=0;
       s1.pop();
  }
    
    return a; 
    }
}