import java.util.*;
class Solution {
    public int[] resultsArray(int[] nums, int k) {
     int r[]=new int[nums.length-k+1];
     int pl[]=new int[nums.length];
     int li[]=new int[nums.length];
     li[0]=0;
     int sum=0;
     int s=0;
     for(int i=0;i<nums.length;i++)
     {
        sum+=nums[i];
        pl[i]=sum;
        if(i>0)
        {
            if(nums[i]>=nums[i-1])
            {
             s++;
             li[i]=s; 
            }
            else
            {
                s=0;
                li[i]=s;
            }
        }
         
     }
     for(int i=0;i<=nums.length-k;i++)
     {
        int val=li[i+k-1]-li[i];
         if(val==k-1)
         {
           
            
            int c=nums[i+k-1];
         
            int d=nums[i]-1;
            int m=(d*(d+1))/2;
            int n=(c*(c+1))/2;
            int l=n-m;
            int t=-5;
            if(i-1>=0)
             t=pl[i+k-1]-pl[i-1];
            else
             t=pl[i+k-1];
            if(t==l)
            r[i]=nums[i+k-1];
            else
            r[i]=-1;
         }
         else
         {
            r[i]=-1;
         }
     }
     return r;
    }
}