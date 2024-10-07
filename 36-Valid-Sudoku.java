class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int a=0,b=3,x=0,y=3;
        
        for(int i=0;i<9;i++)
        {
            // System.out.println(a+\ \+b+\ \+x+\ \+y);
            if(!check(a,b,x,y,board))
            return false;
            if(i==2 || i==5)
            {
                a=a+3;
                b=b+3;
                x=0;
                y=3;
            }
            if(i!=2 && i!=5)
            {
                x=x+3;
                y=y+3;
            }
        }
        if(!check2(0,9,board))
        return false;
        return true;
    }

    boolean check(int a,int b,int x,int y,char[][] board)
    {
        char t[][]=new char[3][3];
        int m=0;
        int n=0;
        for(int i=a;i<b;i++)
        {
            for(int j=x;j<y;j++)
            {
                t[m][n]=board[i][j];
                 n++;
            }
            n=0;
            m++;
        }
       HashSet<Character> hs1=new HashSet<Character>();
         for(int i=0;i<3;i++)
        {
            
            for(int j=0;j<3;j++)
            {
              if(t[i][j]!='.' && !hs1.contains(t[i][j]))
                hs1.add(t[i][j]);
              else if(t[i][j]!='.' && hs1.contains(t[i][j]))
               return false;
            }
           
        }
        HashSet<Character> hs=new HashSet<Character>();
         for(int i=0;i<3;i++)
        {
            
            for(int j=0;j<3;j++)
            {
              if(t[j][i]!='.' && !hs.contains(t[j][i]))
                hs.add(t[j][i]);
              else if(t[j][i]!='.' && hs.contains(t[j][i]))
               return false;
             }
       }
         return true;
    }
     boolean check2(int a,int b,char[][] t)
     {
        for(int i=0;i<9;i++)
        {
            HashSet<Character> hs=new HashSet<Character>();
            for(int j=0;j<9;j++)
            {
              if(t[j][i]!='.' && !hs.contains(t[j][i]))
                hs.add(t[j][i]);
              else if(t[j][i]!='.' && hs.contains(t[j][i]))
               return false;
             }
       }
       for(int i=0;i<9;i++)
        {
            HashSet<Character> hs=new HashSet<Character>();
            for(int j=0;j<9;j++)
            {
              if(t[i][j]!='.' && !hs.contains(t[i][j]))
                hs.add(t[i][j]);
              else if(t[i][j]!='.' && hs.contains(t[i][j]))
               {
                return false;
               }
             }
       }
         return true;
     }
}