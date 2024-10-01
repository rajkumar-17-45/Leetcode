class Solution {
    List<String> li=new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
       backtrack(0,n*2,\\); 
       return li;
    }
    void backtrack(int i,int n,String paren)
    {
        if(i==n)
        {
            // System.out.println(check(paren)+\ \+paren);
           if(check(paren))
           {
            li.add(paren);
           } 
            return ;
        }
        backtrack(i+1,n,paren+\(\);
        backtrack(i+1,n,paren+\)\);
    }
    boolean check(String s)
    {
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            stack.push(c);
            // System.out.println(stack);
           else if(!stack.isEmpty() && c==')' && stack.peek()=='(')
            {
           stack.pop();
            }
            else
            {
                return false;
            }
        }
        if(stack.isEmpty())
        return true;
        return false;
    }
}