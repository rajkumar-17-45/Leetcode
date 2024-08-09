class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int top=0;
     int left=0;
     int bottom=matrix.length-1;
     int right=matrix[0].length-1;
     ArrayList<Integer> a=new ArrayList<Integer>();
     while(top<=bottom && left<=right)
     {
           for(int i=left;i<=right;i++)
           {
              a.add(matrix[top][i]);
           }
           top++;
           for(int i=top;i<=bottom;i++)
           {
           a.add(matrix[i][right]);
           }
           right--;
           if(top<=bottom)
           {
            for(int i=right;i>=left;i--)
            {
                a.add(matrix[bottom][i]);
            }
           }
           bottom--;
           if(left<=right)
           {
            for(int i=bottom;i>=top;i--)
            {
                a.add(matrix[i][left]);
            }
           }
           left++;
     }
     return a;
    }
}