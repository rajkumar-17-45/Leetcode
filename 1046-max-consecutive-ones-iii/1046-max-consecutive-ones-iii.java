class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int max=0;
        int j=0;
        int n=nums.length;
        int c=0;
        while(i<n && j<n)
        {
           if(nums[j]==0)
           c++;
           if(c>k)
           {
            while(nums[i]!=0)
            {
                i++;
            }
            i++;
            c--;
           }
           max=Math.max(max,j-i+1);
           j++;
        }
        return max;
    }
}