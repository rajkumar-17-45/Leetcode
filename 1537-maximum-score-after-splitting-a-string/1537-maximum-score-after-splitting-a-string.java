class Solution {
    public int maxScore(String s) {
    //    int one=0;
    //    int zero=0;
    //    int an=0;
       int max=-1;
       for(int i=0;i<s.length()-1;i++)
       {
    String x=s.substring(0,i+1);
    String y=s.substring(i+1,s.length());
    int a=countzero(x);
    int b=countone(y);
     max=Math.max(a+b,max);
       }
       return max;
    }
    int countzero(String x)
    {
        int c=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='0')
            c++;
        }
        return c;
    }
    int countone(String y)
    {
        int c=0;
        for(int i=0;i<y.length();i++)
        {
            if(y.charAt(i)=='1')
            c++;
        }
        return c;
    }
}