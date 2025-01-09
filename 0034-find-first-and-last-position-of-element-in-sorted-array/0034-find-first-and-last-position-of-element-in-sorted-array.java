class Pair
{
   int i;
   int j;
   public Pair(int i,int j)
   {
    this.i=i;
    this.j=j;
   }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
    // Pair p=new Pair(-1,-1);
    int a=-1;
    int b=-1;
      int n=nums.length;
      int l=0;
      int r=n-1;
      while(l<=r)
      {
        int mid=(l+r)/2;
        if(target==nums[mid])
        {
            if(a==-1)
            a=mid;
            else if(b==-1)
            b=mid;
            break;
        }
        else if(target>nums[mid])
        l=mid+1;
        else
        r=mid-1;
      }
        
       l=0;
       r=n-1;
       while(l<=r)
      {
  int mid=(l+r)/2;
        if(target==nums[mid])
        {
            a=mid;
            r=mid-1;
        }
        else if(target>nums[mid])
        l=mid+1;
        else
        r=mid-1;

      }
     l=a+1;
      r=n-1;
       while(l<=r)
      {
  int mid=(l+r)/2;
        if(target==nums[mid])
        {
            
        
            b=mid;
            l=mid+1;
        }
        else if(target>nums[mid])
        l=mid+1;
        else
        r=mid-1;

      } 
       if(a!=-1 && b==-1)
          return new int[]{a,a};  
    return new int[]{a,b}; 
    //  return new int[]{a,b}; 
    }
}