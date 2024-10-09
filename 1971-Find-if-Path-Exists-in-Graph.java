class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Stack<Integer> stack=new Stack<Integer>();
        int visited[]=new int[n];
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        {
            // List<Integer> li=new ArrayList<Integer>();
            // for(int j=0;j<edges[0].length;j++)
            // {
                l.add(new ArrayList<Integer>());
            // }
        }
        for(int i=0;i<edges.length;i++)
        {
            int x=edges[i][0];
            int y=edges[i][1];
            l.get(x).add(y);
            l.get(y).add(x);
        }
       visited[source]=1;
       stack.push(source);
           backtrack(stack,l,visited);
    //    for(int i=0;i<visited.length;i++)
    //    System.out.println(visited[i]);
       if(visited[destination]==1)
        return true;
        return false;
        
    }
    void backtrack(Stack<Integer> stack,List<List<Integer>> li,int visited[])
    {
        if(stack.isEmpty())
        {
          return ;
        }
        List<Integer> l=li.get(stack.peek());
        // System.out.println(l);
        for(int i=0;i<l.size();i++)
        {
            if(visited[l.get(i)]!=1)
            {
                stack.push(l.get(i));
                visited[l.get(i)]=1;
                backtrack(stack,li,visited);
            }
        }
        stack.pop();
    }
}