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
    public int nearestExit(char[][] maze, int[] e) {

       Queue<Triple> queue=new LinkedList<>();
       queue.add(new Triple(0,e[0],e[1]));
       int row[]={0,-1,1,0};
       int col[]={1,0,0,-1};
       int m=maze.length;
       int n=maze[0].length;
       int dist[][]=new int[m][n];
       for(int x[]:dist)
       {
        Arrays.fill(x,Integer.MAX_VALUE);
       }
       dist[e[0]][e[1]]=0;
        int max=Integer.MAX_VALUE;
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
             if((r==m-1) || r==0 || c==0 || c==n-1)
                        max=Math.min(max,dist[i][j]+1);
                    dist[r][c]=dist[i][j]+1;
                    queue.add(new Triple(dist[i][j]+1,r,c));
                    }
                }
             }
        }
    //    for(int i=0;i<m;i++)
    //    {
    //     System.out.println(Arrays.toString(dist[i]));
    //    }
        
        if(max==Integer.MAX_VALUE)
        return -1;
        return max;
    }
}