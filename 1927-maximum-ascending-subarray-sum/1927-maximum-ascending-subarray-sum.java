class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int n=nums.length;
        int max=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                 max=Math.max(max,sum);
                sum=0;
                sum+=nums[i];
               
            }
            else
            sum+=nums[i];
        }
        max=Math.max(max,sum);
        return max;
    }
}