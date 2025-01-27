class Solution {
    public int reachableNodes(int n, int[][] edges, int[] res) {
        int visited[]=new int[n];
        for(int i=0;i<res.length;i++)
        {
            visited[res[i]]=2;
        }
        int max=0;
        for(int x[]:edges)
        {
         max=Math.max(max,Math.max(x[0],x[1]));
        }
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<=max;i++)
        l.add(new ArrayList<>());
        for(int x[]:edges)
        {
            l.get(x[0]).add(x[1]);
            l.get(x[1]).add(x[0]);
        }
        dfs(l,visited,0);
        int c=0;
        for(int i:visited)
        {
            if(i==1)
            c++;
        }
        return c;
    }
    void dfs(List<List<Integer>> list,int visited[],int node)
    {
      visited[node]=1;
     
       for(int child:list.get(node))
       {
           if(visited[child]==0)
           {
           dfs(list,visited,child);
           }
       }
    }
}