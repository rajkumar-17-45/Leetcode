class Solution {
    public boolean isValid(String string) {
        int i=0;
        Stack<Character> s=new Stack<Character>();
        for(char c:string.toCharArray())
        {
           if(!s.isEmpty() && (c==']'|| c=='}' || c==')'))
           {
            // System.out.print
            if(s.peek()=='{' && c=='}' )
            s.pop();
            else if(s.peek()=='[' && c==']')
            s.pop();
            else if(s.peek()=='(' && c==')')
            s.pop();
            else
            s.push(c);
           }
           else 
           {
            s.push(c);
           }
        }
        if(s.isEmpty())
        return true;
        return false;
    }
}