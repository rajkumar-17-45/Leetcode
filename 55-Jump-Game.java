class Solution {
    public boolean canJump(int[] nums) {
    for(int i=0;i<nums.length;i++)
    {
          if(i>max)
          return false;
          max=Math.max(max,i+nums[i]);
    }
    return true;
    
}}