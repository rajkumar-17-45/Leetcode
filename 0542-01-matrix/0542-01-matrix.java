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
    int count=1;
    boolean val=true;
    int max=0;
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
       boolean visited[][]=new boolean[m][n];
       Queue<Pair> queue=new LinkedList<>();
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(!visited[i][j] && mat[i][j]==0)
            {
                visited[i][j]=true;
               queue.add(new Pair(i,j));
            }
        }
       }
        int result[][]=new int[m][n];
        int l=0;
        int row[]={0,1,0,-1};
        int col[]={1,0,-1,0};
        while(!queue.isEmpty())
        {
            int s=queue.size();
            for(int j=1;j<=s;j++)
            {
               Pair p=queue.poll();
               int a=p.f;
               int b=p.s;
               result[a][b]=l;
               for(int k=0;k<4;k++)
               {
                int r=row[k]+a;
                int c=col[k]+b;
                if(r>=0 && r<m && c>=0 && c<n && mat[r][c]==1 && !visited[r][c])
                {
                    visited[r][c]=true;
                    queue.add(new Pair(r,c));
                }
               }
            }
            l++;
        }
       
       return result;
    }
}