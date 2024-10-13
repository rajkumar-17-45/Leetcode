class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       boolean visited[]=new boolean[rooms.size()];
       Stack<Integer> stack=new Stack<Integer>();
       stack.push(0);
       visited[0]=true;
       backtrack(stack,visited,rooms); 
       for(boolean b:visited)
        if(b==false)
        return false;
       return true;
    }
    void backtrack(Stack<Integer> stack,boolean visited[],List<List<Integer>> rooms)
    {
        if(stack.isEmpty())
        return ;
        List<Integer> list=rooms.get(stack.peek());
        for(int i=0;i<list.size();i++)
        {
            if(!visited[list.get(i)])
            {
                stack.push(list.get(i));
                visited[list.get(i)]=true;
                backtrack(stack,visited,rooms);
            }
        }
          stack.pop();
    }
}