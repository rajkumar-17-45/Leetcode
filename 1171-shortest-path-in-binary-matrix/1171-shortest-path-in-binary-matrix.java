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
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int dist[][]=new int[m][m];
        for(int x[]:dist)
        {
            Arrays.fill(x,Integer.MAX_VALUE);
        }
        PriorityQueue<Triple> pq=new PriorityQueue<>((a,b)-> a.d-b.d);
        dist[0][0]=1;
        if(grid[0][0]==1)
        return -1;
        pq.add(new Triple(1,0,0));
        int row[]={0,0,1,-1,-1,1,-1,1};
        int col[]={1,-1,0,0,-1,1,1,-1};
        while(!pq.isEmpty())
        {
           Triple t=pq.poll();
           int dis=t.d;
           int i=t.i;
           int j=t.j;
           for(int k=0;k<8;k++)
           {
              int r=i+row[k];
              int c=j+col[k];
              if(r>=0 && r<m && c>=0 && c<m && grid[r][c]==0)
              {
                // System.out.println("hello"+" "+i+" "+j);
                if(dist[i][j]+1<dist[r][c])
                {
                    // System.out.println("hehjekj"+r+c);
                    dist[r][c]=dist[i][j]+1;
                    pq.add(new Triple(dist[i][j]+1,r,c));
                }
              }
           }
        }
        if(dist[m-1][m-1]==Integer.MAX_VALUE)
        return -1;
        return dist[m-1][m-1];
        // return 7;
    }
}