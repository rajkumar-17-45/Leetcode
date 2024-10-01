class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1)
        return 2147483647;
        try
        {
           long v=dividend/divisor;
           if(v>Integer.MAX_VALUE)
           return Integer.MAX_VALUE;
           if(v<Integer.MIN_VALUE)
           return Integer.MIN_VALUE;
           return (int)v;
        }
        catch(Exception e)
        {
          return 0;
        }
    }
}