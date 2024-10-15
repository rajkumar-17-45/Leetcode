class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] grid) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        {
           List<Integer> l=new ArrayList<Integer>();
           list.add(l);
        }
        for(int i=0;i<grid.length;i++)
        {
            int a=grid[i][0];
            int b=grid[i][1];
            list.get(a).add(b);
        }
         Stack<Integer> stack=new Stack<Integer>();
         stack.push(k);
         boolean visited[]=new boolean[n];
         visited[k]=true;
         backtrack(stack,list,visited);
        //  System.out.println(list);
         HashSet<Integer> hs=new HashSet<Integer>();
         for(int i=0;i<visited.length;i++)
         {
            if(visited[i])
           hs.add(i);
         }
         boolean b[]=new boolean[n];
         for(int i=0;i<visited.length;i++)
         {
            if(!visited[i] && !b[i])
            {
           Stack<Integer> stack2=new Stack<Integer>();
           stack2.push(i); 
            b[i]=true;
            backtrack(stack2,list,b);
            }
         }
        boolean v=false;
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==b[i])
            v=true;
        }
        List<Integer> result=new ArrayList<Integer>();
        if(v)
        {
         for(int i=0;i<n;i++)
         {
            result.add(i);
         }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(!hs.contains(i))
                {
                    result.add(i);
                }
            }
        }
        return  result;
    }
    void backtrack(Stack<Integer> stack,List<List<Integer>> list,boolean visited[])
    {
        if(stack.isEmpty())
        {
            return ;
        }
        int s=stack.peek();
        List<Integer> l=list.get(s);
        // System.out.println(l+" "+s);
        for(int i=0;i<l.size();i++)
        {
            if(!visited[l.get(i)])
            {
                stack.push(l.get(i));
                visited[l.get(i)]=true;
                backtrack(stack,list,visited);
            }
        }
        stack.pop();
    }
}