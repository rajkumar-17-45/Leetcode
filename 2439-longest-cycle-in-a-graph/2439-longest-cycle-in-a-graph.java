class Solution {
     int max=-1;
    public int longestCycle(int[] edges) {
        List<List<Integer>> list=new ArrayList<>();
        int n=edges.length;
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            if(edges[i]!=-1)
            {
             list.get(i).add(edges[i]);
            }
        }
        int visited[]=new int[n];
        int parent[]=new int[n];
        Arrays.fill(parent,-1);
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,-1,visited,parent,list);
            }
        }
        return max;
    }
    void dfs(int node,int par,int visited[],int parent[],List<List<Integer>> lst)
    {
        visited[node]=1;
        parent[node]=par;
        if(node==-1)
        return ;
        for(int child:lst.get(node))
        {
            if(child==-1)
            return ;
            if(visited[child]==0)
            {
                dfs(child,node,visited,parent,lst);
            }
            else if(visited[child]==1)
            {
                int temp=1;
                while(child!=node)
                {
                    if(node==-1)
                    return ;
                    node=parent[node];
                    temp++;
                }
                if(child==node)
                 {
                   max=Math.max(max,temp);
                 }
            }
        }
    }
}