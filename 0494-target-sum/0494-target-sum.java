class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
    
        return function(nums,target,nums.length-1);
    }
    int function(int nums[],int target,int index)
    {
        if(index==-1)
        {
            if(target==0)
            {
                return 1;
            }
            return 0;
        }
   
      int leftcount=function(nums,target-nums[index],index-1);
        int rightcount=function(nums,target+nums[index],index-1);
        return leftcount+rightcount;
    }
}