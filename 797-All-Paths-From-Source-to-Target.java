class Solution {
     List<List<Integer>>  main=new ArrayList<List<Integer>>();
      boolean bool=false;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      int m=graph.length;
      int n=graph[0].length;
     
      List<List<Integer>>  list=new ArrayList<List<Integer>>();
      int max=0;
      for(int i=0;i<m;i++)
      {
        List<Integer> l=new ArrayList<Integer>();
        for(int j=0;j<graph[i].length;j++)
        {
         l.add(graph[i][j]);
         if(graph[i][j]>max)
         max=graph[i][j];
        }
        list.add(l);
      }
    //   System.out.println(max);
      Stack<Integer> stack=new Stack<Integer>();
      stack.push(0);
      boolean visited[]=new boolean[max+1];
      visited[0]=true;
      List<Integer> result=new ArrayList<Integer>();
      result.add(0);
      backtrack(stack,list,visited,result);
      return main;
    }
    void backtrack(Stack<Integer> stack,List<List<Integer>> list,boolean visited[],List<Integer> res)
    {
        if(stack.isEmpty())
        {
            return ;
        }
       
        int s=stack.peek();
        if(s==list.size()-1)
        {
           main.add(new ArrayList<Integer>(res));  
        }
        List<Integer> l=list.get(s);
        for(int i=0;i<l.size();i++)
        {
            if(!visited[l.get(i)])
            {
                stack.push(l.get(i));
                visited[l.get(i)]=true;
                res.add(l.get(i));
                bool=true;
                backtrack(stack,list,visited,res);
                bool=false;
                res.remove(res.size()-1);
                 visited[l.get(i)]=false;
                 stack.pop();
            }
        }
        
    }
}