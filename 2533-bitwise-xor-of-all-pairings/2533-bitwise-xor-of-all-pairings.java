class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res=0;
        // int n=;
        // int m=;
        if(nums1.length%2!=0)
        {
           for(int i:nums2)
           res^=i;
        }
        if(nums2.length%2!=0)
        {
           for(int i:nums1)
           res^=i;
        }
        
        return res;
    }
}