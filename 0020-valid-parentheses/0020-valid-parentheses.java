class Solution {
    public boolean isValid(String string) {
        int i=0;
        Stack<Character> stack=new Stack<Character>();
        for(char c:string.toCharArray())
        {
            if(!stack.isEmpty())
            {
               
             if((stack.peek()=='('&& c==')') || (stack.peek()=='{'&& c=='}') || (stack.peek()=='[' && c==']')  )
                stack.pop();
                else
                {
                    stack.push(c);
                }
                
            }
            else
            stack.push(c);
        }
        if(stack.size()>0)
        return false;
        return true;
    }
}