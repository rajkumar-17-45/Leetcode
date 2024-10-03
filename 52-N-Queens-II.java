class Solution {
    int count=0;
    public int totalNQueens(int n) {
        
     int upper[]=new int[(2*n)-1];
    int lower[]=new int[(2*n)-1];
    int left[]=new int[n];
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            board[i][j]='.';
        }
    }
    int col=0;
    backtrack(board,col,n,upper,lower,left);
    return count;
    }
    void backtrack(char board[][],int col,int n,int[] upper,int[] lower,int[] left)
    {
        if(col==n)
        {
          count++;
          return ;
        }
        for(int row=0;row<n;row++)
        {
            if(lower[row+col]==0 && upper[(n-1)+(col-row)]==0 && left[row]==0)
            {
          board[row][col]='Q';
          lower[row+col]=1;
          upper[(n-1)+(col-row)]=1;
          left[row]=1;
                backtrack(board,col+1,n,upper,lower,left);
                board[row][col]='.';
               lower[row+col]=0;
               upper[(n-1)+(col-row)]=0;
             left[row]=0;
            }
        }
    }
    
}