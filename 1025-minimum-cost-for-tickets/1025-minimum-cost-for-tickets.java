class Solution {
        int min=Integer.MAX_VALUE;
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int max=-1;
        for(int i:days)
        {
            if(i>max)
            max=i;
        }
        Integer dp[]=new Integer[1000];
        return mincost(0,0,0,days,costs,n,dp);
    }
    int mincost(int index,int cost,int day,int arr1[],int arr2[],int n,Integer dp[])
    {
          if(index==n)
          {    
            return 0;
          }
          if(dp[day]!=null)
          return dp[day];
           int val=Integer.MAX_VALUE;
           int one=Integer.MAX_VALUE;
           int seven=Integer.MAX_VALUE;
           int thirty=Integer.MAX_VALUE;
          if(arr1[index]>day)
          {
            one=arr2[0]+mincost(index+1,cost+arr2[0],arr1[index],arr1,arr2,n,dp);
           seven=arr2[1]+mincost(index+1,cost+arr2[1],arr1[index]+6,arr1,arr2,n,dp);
            thirty=arr2[2]+mincost(index+1,cost+arr2[2],arr1[index]+29,arr1,arr2,n,dp);
          }
          else
          {
           val=mincost(index+1,cost,day,arr1,arr2,n,dp);
          }
          return dp[day]=Math.min(val,Math.min(one,Math.min(seven,thirty)));
    }
}