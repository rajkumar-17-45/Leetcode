class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        int c=0;
        int max=0;
        while(i<n && j<n)
        {
            if(nums[j]==0)
            c++;
            if(c>1)
            {
                while(nums[i]!=0)
                i++;
                i++;
                c--;
            }
           
            max=Math.max(max,j-i+1-1);
            j++;
        }
        return max;
    }
}