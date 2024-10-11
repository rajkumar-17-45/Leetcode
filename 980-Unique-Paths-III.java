class Solution {
    int count=0;
    public int uniquePathsIII(int[][] grid) {
    boolean visited[][]=new boolean[grid.length][grid[0].length];
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[0].length;j++)
        {
          if(grid[i][j]==1)
          {
            backtrack(i,j,grid,visited);
          } 
        }
    }
     return count;
    }
    void backtrack(int i,int j,int[][] grid,boolean[][] visited)
    {
        int m=grid.length;
        int n=grid[0].length;
       if(grid[i][j]==2)
    {
       if(check(visited,grid))
       count++;
    }
       visited[i][j]=true;
       if(i+1<m && !visited[i+1][j] && grid[i+1][j]!=-1)
       {
        backtrack(i+1,j,grid,visited);
       }
        if(j+1<n && !visited[i][j+1] && grid[i][j+1]!=-1)
       {
        backtrack(i,j+1,grid,visited);
       }
        if(i-1>=0 && !visited[i-1][j] && grid[i-1][j]!=-1)
       {
        backtrack(i-1,j,grid,visited);
       }
        if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]!=-1)
       {
        backtrack(i,j-1,grid,visited);
       }
       visited[i][j]=false;
    }
    boolean check(boolean[][] visited,int[][] grid)
    {
        for(int i=0;i<visited.length;i++)
        {
            for(int j=0;j<visited[0].length;j++)
            {
                if(visited[i][j]==false && grid[i][j]!=1 && grid[i][j]!=2 && grid[i][j]!=-1)
                return false;
            }
        }
        return true;
    }
}