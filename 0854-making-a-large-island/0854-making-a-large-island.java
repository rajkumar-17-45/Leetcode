class Disjoint 
{
    int parent[];
    int size[];
    public Disjoint(int m)
    {
        parent=new int[m];
        size=new int[m];
        for(int i=0;i<m;i++)
        {
            parent[i]=i;
            size[i]=1;
        }
    }
    int find(int ele)
    {
        if(ele==parent[ele])
        return ele;
        return parent[ele]=find(parent[ele]);
    }
    boolean union(int u,int v)
    {
        int ul_u=find(u);
        int ul_v=find(v);
        if(ul_u==ul_v)
        return false;
        if(size[ul_u]<size[ul_v])
        {
            parent[ul_u]=parent[ul_v];
            size[ul_v]+=size[ul_u];
        }
        else
        {
            parent[ul_v]=parent[ul_u];
            size[ul_u]+=size[ul_v];
        }
        return true;
    }
}
class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int row[]={0,1,0,-1};
        int col[]={1,0,-1,0};
        Disjoint ds=new Disjoint(n*n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                  if(grid[i][j]==1)
                  {
                    for(int k=0;k<4;k++)
                    {
                        int r=i+row[k];
                        int c=j+col[k];
                        if(r>=0 && c>=0 && r<n && c<n && grid[r][c]==1)
                        {
                          int f=j+(i*n);
                          int s=c+(r*n);
                          ds.union(f,s);
                        }
                    }
                  }
            }
        }
        // HashSet<Integer> hs=new HashSet<>();
        // int c=0;
        int max=1;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                  HashSet<Integer> hs=new HashSet<>();
                  if(grid[i][j]==0)
                  {
                     for(int k=0;k<4;k++)
                    {
                        int r=i+row[k];
                        int c=j+col[k];
                        if(r>=0 && c>=0 && r<n && c<n && grid[r][c]==1)
                        {
                        //   int f=j+(i*n);
                          int s=c+(r*n);
                           hs.add(ds.find(s));
                        }
                    }
                  }
                  else
                  {
                       int s=j+(i*n);
                       max=Math.max(max,ds.size[s]);
                  }
                  int sum=1;
                  for(int x:hs)
                  {
                   sum+=ds.size[x];
                  }
                  max=Math.max(max,sum);
            }
        }
    
        // System.out.println(hs.size());
        return max;
    }
    
}