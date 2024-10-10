class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int fill=image[sr][sc];
        int m=image.length;
        int n=image[0].length;
        boolean visited[][]=new boolean[m][n];
        backtrack(image,sr,sc,color,fill,visited,m,n);
        return image;
    }
    void backtrack(int[][] image,int i,int j,int color,int fill,boolean[][] visited,int m,int n)
    {
        if(i<m && j<n && image[i][j]==fill)
        {
          image[i][j]=color;
        }
        visited[i][j]=true;
          if(j-1>=0 && !visited[i][j-1] && image[i][j-1]==fill)
        {            
        backtrack(image,i,j-1,color,fill,visited,m,n);
        }
        if(i+1<m && !visited[i+1][j] && image[i+1][j]==fill)
        {
            backtrack(image,i+1,j,color,fill,visited,m,n);
        }
        if(j+1<n && !visited[i][j+1] && image[i][j+1]==fill)
        {
           backtrack(image,i,j+1,color,fill,visited,m,n);
        }
        if(i-1>=0 && !visited[i-1][j] && image[i-1][j]==fill)
        {
           backtrack(image,i-1,j,color,fill,visited,m,n);
        }
      
        visited[i][j]=false;
    }
}