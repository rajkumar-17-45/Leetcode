class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ii=1;
        int d=1;
        int max=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i]){
                d++;
            }
            else
            {
                d=1;
            }
            if(nums[i]>nums[i-1]){
                ii++;
            }
            else
            {
                ii=1;
            }
            max=Math.max(max,Math.max(ii,d));
        }
        return max;
    }
}