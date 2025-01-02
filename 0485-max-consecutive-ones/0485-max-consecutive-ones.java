class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
         int i=0;
        int max=0;
        int j=0;
        int n=nums.length;
        int c=0;
        while( j<n)
        {
            if(nums[j]==1)
            c++;
            if(nums[j]==0)
            c=0;
            else 
            max=Math.max(max,c);
            j++;
        }
        return max;
    }
}