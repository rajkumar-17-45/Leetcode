class Solution {
    public String removeKdigits(String num, int k) {
     Stack<Integer> stack=new Stack<Integer>();
     if(num.length()==1)
     {
        if(k==1)
        return \0\;
     }
     for(int i=0;i<num.length();i++)
     {
        int j=(int)(num.charAt(i)-'0');
        while(!stack.isEmpty() && k!=0 && j<stack.peek())
        {
        
            stack.pop();
            k--;
            
        }
        stack.push(j);
     }
     boolean b=false;
     String result=new String();
      
      while(k>0 && !stack.isEmpty())
      {
        stack.pop();
        k--;
      }
      while(!stack.isEmpty() )
      {
       
       result+=stack.peek();
       stack.pop();
      }
     StringBuffer sb=new StringBuffer(result).reverse();
    while(sb.length()>=1 && sb.charAt(0)=='0')
    {
        sb.deleteCharAt(0);
    }
    if(sb.length()==0)
    return \0\;
     return sb.toString();
    }
}