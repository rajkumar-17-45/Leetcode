class Pair
{
    int i;
    int value;
    public Pair(int i,int value)
    {
        this.i=i;
        this.value=value;
    }
}
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int val=0;
        int n=values.length-1;
    
        Pair p=new Pair(0,values[0]);
            int max=values[0];
            int res=Integer.MIN_VALUE;
        for(int i=1;i<values.length;i++)
        {
           
           int x=p.i;
           int y=p.value;
           if(values[i]+y+x-i>res)
           {
            res=values[i]+y+x-i;
           }
           if(values[i]+i>=max)
           {
            max=values[i]+i;
            // System.out.println(max+" "+i);
            p=new Pair(i,values[i]);
           }
        }
        return res;
    }
}