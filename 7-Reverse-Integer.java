class Solution {
    public int reverse(int x) {
        if(x==0)
        return 0;
    String s=String.valueOf(x);
    StringBuffer sb=new StringBuffer(s);
    // sb.reverse();
    int f=1;
    if(sb.charAt(0)=='-')
    {
    sb.deleteCharAt(0);
    f=0;
    }
    sb=new StringBuffer(sb.toString().trim());
     sb.reverse();
     int i=0;
     while(i<sb.length() && sb.charAt(i)=='0')
     {
        sb.deleteCharAt(i);
     }
    // System.out.println(sb);
    if(f==0)
    sb.insert(0,\-\);
    // System.out.println(sb);
    int max=Integer.MAX_VALUE;
    int min=Integer.MIN_VALUE;
    try
    {
        long result=Long.parseLong(sb.toString());
        if(result>max)
        return 0;
        if(result<min)
       return 0;
       if(result<=max && result>=min)
       return (int)result;
    }
    catch(Exception e)
    {

    }
    
    return 17;
    }
}