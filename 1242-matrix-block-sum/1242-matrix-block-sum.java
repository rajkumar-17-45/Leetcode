class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
      int prefix[][]=new int[m][n];
      int result[][]=new int[m][n];
      for(int i=0;i<m;i++)
      {
        int sum=0;
        for(int j=0;j<n;j++)
        {
       sum+=mat[i][j];
       prefix[i][j]=sum;
        }
      }  
      for(int i=0;i<n;i++)
      {
        int sum=0;
        for(int j=0;j<m;j++)
        {
            sum+=prefix[j][i];
            prefix[j][i]=sum;
        }
      }
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            int a=i-k;
            int b=i+k;
            int c=j-k;
            int d=j+k;
            // a=1;
            // b=2;
            // c=1;
            // d=2;
            if(a<0)
            a=0;
            if(b>=m)
            b=m-1;
            if(c<0)
            c=0;
            if(d>=n)
            d=n-1;
            int val=0;
            for(int q=a;q<=b;q++)
            {
                   if(a==q)
                   {
                       val+=prefix[q][c]-mat[q][c];
                   }
                   else 
                   {
                 if(q-1>=0)
                 {
                val+=prefix[q][c]-prefix[q-1][c]-mat[q][c];
                 }
            
                   }
            }
            for(int f=c+1;f<=d;f++)
            {
                 if(f-1>=0)
                 {
                val+=prefix[a][f]-prefix[a][f-1]-mat[a][f];
                 }
               
            }
         result[i][j]=prefix[b][d]-val;
        }
      }
      return result;
    }
}