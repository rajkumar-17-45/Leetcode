class Solution {
    public int myAtoi(String s) {
        
        StringBuffer my=new StringBuffer(s.trim());
        // System.out.println(my);
        if(my.length()>1)
        {
            if(my.charAt(0)=='0' && my.charAt(1)==' ')
            return 0;
        }
        if(my.length()==1)
        {
            if(Character.isDigit(my.charAt(0)))
            return Integer.parseInt(my.toString());
            else 
            return 0;
        }
        // System.out.println(my);
    
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<my.length();i++)
        {
            char a=my.charAt(i);
            if(Character.isLetter(a))
            {
                break;
            }
        sb.append(a);
        }
        
         int i=0;
         int flag=0;
         while(i<sb.length() && sb.charAt(i)=='0')
         {
               sb.deleteCharAt(i);
             
            //    System.out.println(i+\ values are these ones\+sb.length());
               flag=1;
         }
         if(flag==1 && !sb.isEmpty())
         {
            if(sb.charAt(0)=='+' || sb.charAt(0)=='-')
            return 0;
         }
        //  StringBuffer st=new StringBuffer();
        if(!sb.isEmpty())
        {
       char c=sb.charAt(0);
    //    System.out.println(sb+\ hhje\);
       if(c=='-' && flag==1)
       return 0;
    //    System.out.println(\hudhujde\);
       if(sb.length()>1)
       {
          if(c=='-' || c=='+')
          {
            char x=sb.charAt(1);
            int j=1;
           if(x=='0')
           {
           while(j<sb.length() && sb.charAt(j)=='0')
            {
               sb.deleteCharAt(j);
               j++;
           }
           }
          }
       }
        }    
        sb=new StringBuffer(sb.toString().trim()); 
      
        if(sb.isEmpty())
        return 0;
        int minvalue=Integer.MIN_VALUE;
        int maxvalue=Integer.MAX_VALUE;
        //   System.out.println(sb);
          if(!sb.isEmpty())
          {
            char c=sb.charAt(0);
            if(sb.length()>1)
            {
            char q=sb.charAt(1);
            if(c=='+' && q=='-')
            {
               return 0;
            }
            if(c=='-'&&  q=='+')
            {
                return 0;
            }
            }
          }
         if(!sb.isEmpty())
         {
            char c=sb.charAt(0);
            if(c=='+' || c=='-')
            {
                int vi=1;
                   
                if(vi<sb.length() && sb.charAt(vi)==' ')
                {
                    
                    return 0;
                }
            }
         }
         if(sb.length()==1 && sb.charAt(0)=='+')
         {
            return 0;
         }
         if(sb.length()==1 && sb.charAt(0)=='-')
         {
            return 0;
         }
        //    System.out.println(sb+\ last\);
         StringBuffer strbuf=new StringBuffer();
         int q=0;
          for(int k=0;k<sb.length();k++)
          {
            if(k>0)
              if(sb.charAt(k)=='+' ||sb.charAt(k)=='-')
              break;
            if(sb.charAt(k)==' ' )
            break;
            if(q==0)
            {
                // System.out.println(\yudfhdfj\);
                if(sb.charAt(k)=='+')
                q=1;
                else if(sb.charAt(k)=='-')
                q=1;
            }
            // System.out.println(q);
            else 
            {
                //  System.out.println(\yudfhdfj\);
                if(sb.charAt(k)=='+')
                break;
                 if(sb.charAt(k)=='-')
                 {
                    // System.out.println(i+\ i value\);
                break;
                 }
            }
            strbuf.append(sb.charAt(k));
          }
          sb=strbuf;
        //  System.out.println(sb+\ last\);
        try {
    double v = Double.parseDouble(sb.toString());
    
   
    long rounded = Math.round(v);
    
   
    if (rounded > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
    } else if (rounded < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
    } else {
        return (int) rounded;
    }
} catch (NumberFormatException e) {
    
    return 0; 
}
        //  return 0;
        // System.out.println(sb);
        // return 5;
    }
}