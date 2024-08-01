class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid=-1;
        if(nums.length==1)
        return 0;
      if(nums.length==2)
      {
        if(nums[0]>nums[1])
        return 0;
        if(nums[1]>nums[0])
        return 1;
        else
        return -1;
      }
      if(nums.length>2)
      {
        if(nums[0]>nums[1])
        return 0;
        if(nums[nums.length-1]>nums[nums.length-2])
        return nums.length-1;
      }
        while(l<=r)
        {
            mid=(l+r)/2;
            if(mid <nums.length && mid>=0  && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
            return mid;
            else if(mid+1<nums.length && nums[mid] <nums[mid+1])
            {
            l=mid+1;
            }
            else if(mid-1>=0 && nums[mid] <nums[mid-1])
            {
              r=mid-1;
            }
        }
        return -1;
    }
}