class Solution {
    public int trap(int[] height) {
        int n=height.length;
    int suffix[]=new int[n];
    int max=0;
    for(int i=n-1;i>=0;i--) 
    {
        max=Math.max(height[i],max);
        suffix[i]=max;
    }
    max=0;
    int res=0;
    for(int i=0;i<n;i++) 
    {
        max=Math.max(height[i],max);
        res+=Math.min(max,suffix[i])-height[i];
    }
    // System.out.println(Arrays.toString(suffix));
    return res;
    }
}