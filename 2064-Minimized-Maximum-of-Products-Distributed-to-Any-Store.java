class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=max(quantities);
        while(l<=r)
        {
            int mid=(l+r)/2;
            int val=sum(quantities,mid);
            if(val<=n)
            {
                r=mid-1;
            }
            else
            l=mid+1;
        }
        return l;
    }
    static int max(int nums[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            max=nums[i];
        }
        return max;
    }
    static int sum(int nums[],int val)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil((double)nums[i]/val);
         }
         return sum;
    }
}