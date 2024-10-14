class Pair
{
    int f;
    int s;
    public Pair(int f,int s)
    {
        this.f=f;
        this.s=s;
    }
}
class Solution {
    int count=0;
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
      boolean visited[][]=new boolean[m][n];
         Queue<Pair> queue=new LinkedList<Pair>();
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==2)
            {
             
                queue.add(new Pair(i,j));
                visited[i][j]=true;
                
            }
        }
      }
      backtrack(grid,visited,queue);
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==1)
            return -1;
        }
      }
      if(count==0)
      return 0;
       return count;
    }
     void backtrack(int[][] grid,boolean[][] visited,Queue<Pair> queue)
      {
        int m=grid.length;
        int n=grid[0].length;
         boolean b=false;
        if(queue.isEmpty())
        {
            return ;
        }
       
        int s=queue.size();
        for(int k=0;k<s;k++)
        {
             Pair p=queue.poll();
             int i=p.f;
             int j=p.s;
            //  System.out.println(i+" "+j);
           if(i+1<m && !visited[i+1][j] && grid[i+1][j]==1)
           {
            queue.add(new Pair(i+1,j));
            visited[i+1][j]=true;
            grid[i+1][j]=2;
            b=true;
           }
           if(j+1<n && !visited[i][j+1] && grid[i][j+1]==1)
           {
            queue.add(new Pair(i,j+1));
            visited[i][j+1]=true;
            grid[i][j+1]=2;
            b=true;
           }
           if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]==1)
           {
            queue.add(new Pair(i,j-1));
            visited[i][j-1]=true;
            grid[i][j-1]=2;
            b=true;
           }
           if(i-1>=0 && !visited[i-1][j] && grid[i-1][j]==1)
           {
            queue.add(new Pair(i-1,j));
            visited[i-1][j]=true;
            grid[i-1][j]=2;
            b=true;
           }
        }
        if(b)
        {
        count++;
        }
       backtrack(grid,visited,queue);
      }
}