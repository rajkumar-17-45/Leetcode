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
    boolean bool=false;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
    
    int m=grid2.length;
    int n=grid2[0].length;
    int count=0;
    int matrix[][]=new int[m][n];
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
     
         if(grid2[i][j]==1)
         {
              Queue<Pair> queue=new LinkedList<Pair>();
           queue.add(new Pair(i,j));
           check(grid2,queue);
           grid2[i][j]=-1;
         }
         if(grid1[i][j]==1)
         {
              Queue<Pair> queue=new LinkedList<Pair>();
           queue.add(new Pair(i,j));
           check(grid1,queue);
           grid1[i][j]=-1;
         }
        }
     }
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
     
         if(grid2[i][j]==-1)
         {
              Queue<Pair> queue=new LinkedList<Pair>();
              bool=false;
            //   System.out.println("call "+i+" "+j);
           queue.add(new Pair(i,j));
           check2(grid2,queue,grid1);
           if(!bool)
           count++;
           grid2[i][j]=-5;
         }
        }
     }
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
        //  if(grid2[i][j]==-1)
        //  {
        
        // System.out.println(grid2[i][j]+" "+i+" "+j);
        //  }
        }
     }
     return count;
    }
    void check(int[][] grid,Queue<Pair> queue)
    {
          int m=grid.length;
        int n=grid[0].length;
        int rowarr[]={0,0,+1,-1};
        int colarr[]={+1,-1,0,0};
        while(!queue.isEmpty())
        {
             Pair p=queue.poll();
             int r=p.val1;
             int c=p.val2;
             for(int i=0;i<4;i++)
             {
                int row=r+rowarr[i];
                int col=c+colarr[i];
                if(row<m && row>=0 && col<n && col>=0 && grid[row][col]==1)
                {
                    grid[row][col]=-1;
                    queue.add(new Pair(row,col));
                }
             }
        }
    }
     void check2(int[][] grid,Queue<Pair> queue,int[][] ans)
    {
          int m=grid.length;
        int n=grid[0].length;
        int rowarr[]={0,0,+1,-1};
        int colarr[]={+1,-1,0,0};
        int f=0;
        while(!queue.isEmpty())
        {
             Pair p=queue.poll();
             int r=p.val1;
             int c=p.val2;
             for(int i=0;i<4;i++)
             {
                int row=r+rowarr[i];
                int col=c+colarr[i];
                if(row<m && row>=0 && col<n && col>=0 && grid[row][col]==-1)
                {
                    f=1;
                if(grid[row][col]!=ans[row][col])
                  bool=true;
                   grid[row][col]=-5;
                    queue.add(new Pair(row,col)); 
                }
                
             }
             if(f==0)
             {
                if(grid[r][c]!=ans[r][c])
                bool=true;
             }
        }
    }
}