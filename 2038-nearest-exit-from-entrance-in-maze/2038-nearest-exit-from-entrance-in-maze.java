class Triple
{
   int d;
    int i;
    int j;
    public Triple(int d,int i,int j)
    {
        this.d=d;
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int nearestExit(char[][] maze, int[] enterance) {

       PriorityQueue<Triple> queue=new PriorityQueue<>((a,b)->a.d-b.d);
       queue.add(new Triple(0,enterance[0],enterance[1]));
       int row[]={0,-1,1,0};
       int col[]={1,0,0,-1};
       int m=maze.length;
       int n=maze[0].length;
       int dist[][]=new int[m][n];
       for(int x[]:dist)
       {
        Arrays.fill(x,Integer.MAX_VALUE);
       }
       dist[enterance[0]][enterance[1]]=0;
        while(!queue.isEmpty())
        {
             Triple t=queue.poll();
             int d=t.d;
             int i=t.i;
             int j=t.j;
             for(int k=0;k<4;k++)
             {
                int r=i+row[k];
                int c=j+col[k];
                if(r>=0 && r<m && c>=0 && c<n && maze[r][c]=='.')
                {
                    if(dist[i][j]+1<dist[r][c])
                    {
                    dist[r][c]=dist[i][j]+1;
                    queue.add(new Triple(dist[i][j]+1,r,c));
                    }
                }
             }
        }
        int max=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
          if((i!=enterance[0] || enterance[1]!=0) && maze[i][0]=='.')
          {
          max=Math.min(dist[i][0],max);
        //    System.out.println(dist[i][0]+" "+i+" 0");
          }
        //   System.out.println(maze[i][0]);
          if((i!=enterance[0] || enterance[1]!=n-1) && maze[i][n-1]=='.')
          {
          max=Math.min(dist[i][n-1],max);
        // System.out.println(maze[i][n-1]);
        //    System.out.println(dist[i][n-1]+" "+i+" "+(n-1));
          }
        }
         for(int j=0;j<n;j++)
        {
          if((enterance[0]!=0 || enterance[1]!=j) && maze[0][j]=='.')
          {
          max=Math.min(dist[0][j],max);
            //   System.out.println(dist[0][j]+" 0"+" "+j);
          }
        // System.out.println(maze[m-1][j]);
          if((enterance[0]!=m-1 || enterance[1]!=j) && maze[m-1][j]=='.')
          {
          max=Math.min(dist[m-1][j],max);
          }
        }
        if(max==Integer.MAX_VALUE)
        return -1;
        return max;
    }
}