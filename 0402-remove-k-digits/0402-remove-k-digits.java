class Solution {
    public String removeKdigits(String num, int k) {
     Stack<Integer> stack=new Stack<Integer>();
     for(char x:num.toCharArray())
     {
        int i=(int)x-48;
        while(!stack.isEmpty() && k>0 && stack.peek()>i)
        {
            stack.pop();
            k--;
        }
        stack.push(i);
     }
     while(k!=0)
     {
        stack.pop();
        k--;
     }
     StringBuffer sb=new StringBuffer();
     while(!stack.isEmpty())
     {
        sb.append(stack.pop());
     }
     sb.reverse();
     while(sb.length()!=0 && sb.charAt(0)=='0')
     {
        sb.deleteCharAt(0);
     }
     System.out.println(sb);
    // if(sb.length()==0)
    // return "0";
    if(sb.length()==0)
    return "0";
     return sb.toString();
    }
}