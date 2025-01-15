class Solution {
    public int minimizeXor(int num1, int num2) {
        StringBuffer sb=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        int n1=num1;
        int n2=num2;
        int c1=0;
        int c2=0;
        while(n1>0)
        {
            if((n1&1)==1)
            {
            sb.append('1');
            c1++;
            }
            else
            sb.append('0');
            n1=n1>>1;
        }
        sb.reverse();
        while(n2>0)
        {
            if((n2&1)==1)
            {
            sb2.append('1');
            c2++;
            }
            else
            sb2.append('0');
            n2=n2>>1;
        }
         sb2.reverse();
         if(c1==c2)
         return num1;
          if(c2>c1)
         {
               if(sb.length()<sb2.length())
               {
                    while(sb.length()!=sb2.length())
                    sb.insert(0,'0');
               }
               int val=c2-c1;
               StringBuffer s=sb;  
               int j=0;
               for(int i=s.length()-1;i>=0;i--)
               {
                    if(s.charAt(i)=='0')
                    {
                    s.setCharAt(i,'1');
                    val--;
                    }
                    if(val==0)
                    {
                        j=i;
                    break;
                    }
               }
               return Integer.parseInt(sb.toString(),2);
         }
         if(c1>c2)
         {
               int val=c1-c2;
               StringBuffer s=sb;  
               int j=0;
               for(int i=s.length()-1;i>=0;i--)
               {
                    if(s.charAt(i)=='1')
                    {
                        s.setCharAt(i,'0');
                    val--;
                    }
                    if(val==0)
                    {
                    break;
                    }
               }
           
               return Integer.parseInt(sb.toString(),2);
         }
       return 17;
    }
}