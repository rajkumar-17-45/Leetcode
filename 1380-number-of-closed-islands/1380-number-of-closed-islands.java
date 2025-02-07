class Pair
{
    int val1;
    int val2;
    public Pair(int val1,int val2)
    {
        this.val1=val1;
        this.val2=val2;
    }
}
class Solution {
    public int closedIsland(int[][] grid) {
      int m=grid.length;
      int n=grid[0].length;
      int visited[][]=new int[m][n];
      int row[]={0,1,0,-1};
      int col[]={1,0,-1,0};
      int cnt=0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==0 && visited[i][j]==0 && i!=0 && j!=0 && i!=m-1 && j!=n-1)
            {
                // System.out.println(i+" "+j);
                visited[i][j]=1;
                Queue<Pair> queue=new LinkedList<Pair>();
                queue.add(new Pair(i,j));
                boolean b=true;
                while(!queue.isEmpty())
                {
                   Pair p=queue.poll();
                   int x=p.val1;
                   int y=p.val2;
                   for(int k=0;k<4;k++)
                   {
                    int r=x+row[k];
                    int c=y+col[k];
                    if(r>=0 && r<m && c>=0 && c<n && visited[r][c]==0 && grid[r][c]==0)
                    {
                    
                        visited[r][c]=1;
                        if(r==0 || r==m-1 || c==0 || c==n-1)
                        {
                            if(grid[r][c]==0)
                            b=false;
                        }
                        // if(b)
                        queue.add(new Pair(r,c));
                    }
                    
                   }
                }
                if(b)
                cnt++;
            }
        }
      } 
      return cnt;      
    }
}