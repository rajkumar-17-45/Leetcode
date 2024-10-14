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
    public int numIslands(char[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             if(grid[i][j]=='1')
             {
                Queue<Pair> queue=new LinkedList<Pair>();
              queue.add(new Pair(i,j)); 
              check(queue,grid); 
              count++;
             }
            }
         
        }
           return count;
    }
    void check(Queue<Pair> queue,char[][] grid)
    {
        int a[]={-1,0,+1,0};
        int b[]={0,+1,0,-1};
        int m=grid.length;
        int n=grid[0].length;
        while(!queue.isEmpty())
        {
          Pair p=queue.poll();
          int r=p.f;
          int c=p.s;
          for(int i=0;i<4;i++)
          {
            int row=r+a[i];
            int col=c+b[i];
            if(row>=0 && row<m && col>=0 && col<n && grid[row][col]=='1')
            {
                queue.add(new Pair(row,col));
                grid[row][col]='0';
            }
          }
        }
    }
}