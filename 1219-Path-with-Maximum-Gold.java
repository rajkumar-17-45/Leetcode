class Solution {
      int max=-1;
    public int getMaximumGold(int[][] grid) {
        int sum=0;
      
        boolean bool[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)
                {
                    sum+=grid[i][j];
                    if(sum>max)
                    max=sum;
                 backtrack(i,j,grid,bool,sum,i,j);
                 sum=0;
                }
            }
        }
        if(max==-1)
        return 0;

        return max;
    }
void backtrack(int i,int j,int[][] grid,boolean[][] visited,
int sum,int s,int e)
    {
        int m=grid.length;
        int n=grid[0].length;
       visited[i][j]=true;
   
       if(i+1<m && !visited[i+1][j] && grid[i+1][j]!=0)
       {
         sum+=grid[i+1][j];
         if(sum>max)
         max=sum;
        //  System.out.println(m);
         backtrack(i+1,j,grid,visited,sum,s,e);
         sum-=grid[i+1][j];
       }
       if(j+1<n && !visited[i][j+1] &&  grid[i][j+1]!=0)
       {
         sum+=grid[i][j+1];
           if(sum>max)
         max=sum;
        //   System.out.println(m);
         backtrack(i,j+1,grid,visited,sum,s,e);
           sum-=grid[i][j+1];
       }
       
       if(j-1>=0 && !visited[i][j-1] &&  grid[i][j-1]!=0)
       {
         sum+=grid[i][j-1];
           if(sum>max)
         max=sum;
        //   System.out.println(m);
         backtrack(i,j-1,grid,visited,sum,s,e);
          sum-=grid[i][j-1];
       }
     
        if(i-1>=0 && !visited[i-1][j] &&  grid[i-1][j]!=0)
       {
         sum+=grid[i-1][j];
           if(sum>max)
         max=sum;
        //   System.out.println(m);
         backtrack(i-1,j,grid,visited,sum,s,e);
          sum-=grid[i-1][j];
       }
      
         visited[i][j]=false;
    }
}