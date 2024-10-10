class Solution {
    boolean b=false;
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] bool = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word.charAt(0) == board[i][j]) {
                    if(word.length()==1)
                    return true;
                    int l = word.length();
                   backtrack(i, j, word, board, bool, l, 0);
                   if(b)
                   return true;
                }
            }
        }
        return false;
    }

  void  backtrack(int i,int j,String word,char[][] board,boolean[][] visited,int l,int c)
    {
   int m=board.length;
   int n=board[0].length;
  
   if(i>=m ||  j>=n || c>=l )
   return ;
   visited[i][j]=true;
//    System.out.println(\hello bro hai\);
   if(i+1<m && !visited[i+1][j])
   {
    if(c+1<l &&  word.charAt(c+1)==board[i+1][j])
    { 
        // System.out.println(\hai\+word.charAt(c+1));
    if(c+1==l-1)
    {
    b=true;
    return ;
    }
    backtrack(i+1,j,word,board,visited,l,c+1);
    }
    
   }

   if(c+1<l && j+1<n && !visited[i][j+1])
   {
    if(word.charAt(c+1)==board[i][j+1])
    {
        //  System.out.println(\hai\+word.charAt(c+1));
    if(c+1==l-1)
    {
    b=true;
    return ;
    }
    backtrack(i,j+1,word,board,visited,l,c+1);
    }
   }
  if(c+1<l && j-1>=0 && !visited[i][j-1])
   {
    // System.out.println(i+\ value\);
    if( word.charAt(c+1)==board[i][j-1])
    {
        //  System.out.println(\hai\+word.charAt(c+1));
    if(c+1==l-1)
    {
    b=true;
    return ;
    }
    backtrack(i,j-1,word,board,visited,l,c+1);
    }
   }
     if(c+1<l && i-1>=0 && !visited[i-1][j])
   {
    if( word.charAt(c+1)==board[i-1][j])
    { 
    // System.out.println(\hai\+word.charAt(c+1));
    if(c+1==l-1)
    {
    b=true;
    return ;
    }
    backtrack(i-1,j,word,board,visited,l,c+1);
    }
   }
   visited[i][j]=false;
    
    
    }}