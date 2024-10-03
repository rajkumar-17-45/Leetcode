class Solution {
    List<List<String>> ans=new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
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
    return ans;
    }
    void backtrack(char board[][],int col,int n,int[] upper,int[] lower,int[] left)
    {
        if(col==n)
        {
          ans.add(construct(board));
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
    List<String> construct(char board[][])
    {
        int n=board.length;
        List<String> result=new ArrayList<String>();
        for(int i=0;i<board.length;i++)
        {
            String s=new String();
            for(int j=0;j<board[0].length;j++)
            {
                s+=board[i][j];
            }
            result.add(s);
        }
        return result;
    }
    
}
