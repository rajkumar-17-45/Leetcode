class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int n=nums.length;
      int left=Integer.MIN_VALUE;
      int right=Integer.MAX_VALUE;
       for(int i=0;i<nums.length-2;i++)
       {
        int l=i+1;
        int r=nums.length-1;
        while(l<r)
        {
            int sum=nums[l]+nums[r]+nums[i];
            if(sum<target)
            {
                left=Math.max(left,sum);
                l++;
               
            }
            else
            {
                right=Math.min(right,sum);
                r--;
            }
        }
       }  
       if(left==Integer.MIN_VALUE)
       return right;
       if(right==Integer.MAX_VALUE)
       return left;
            // System.out.println(left+" "+right);
       if(Math.abs(target-left)<Math.abs(target-right))
       return left;
       return right;
    //    return nums[n-1];
    }
}