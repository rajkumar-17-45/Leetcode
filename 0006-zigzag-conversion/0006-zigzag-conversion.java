class Solution {
    public String convert(String s, int numRows) {
        String arr[]=new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            arr[i]="";
        }
        int x=0;
        int f=1;
        while(x<s.length())
        {
          if(f==1)
          {
            for(int i=0;i<numRows;i++)
            {
              
                if(x<s.length())
               arr[i]+=String.valueOf(s.charAt(x));
                x++;
            }
            f=0;
          }
          else if(f==0)
          {
            for(int i=numRows-2;i>0;i--)
            {
              
                if(x<s.length())
               arr[i]+=String.valueOf(s.charAt(x));
                x++;
            }
            f=1;
          }
        //   x++;
        }
        String babluragu=new String();
        for(String c:arr)
        babluragu+=c;
        return babluragu;
    }
}