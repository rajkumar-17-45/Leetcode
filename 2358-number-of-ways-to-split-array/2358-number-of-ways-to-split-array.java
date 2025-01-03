class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long prefix[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
           sum+=nums[i];
           prefix[i]=sum;
        }
        int c=0;
        //   System.out.println(Arrays.toString(prefix));
          for(int i=0;i<n-1;i++)
          {
            long p=prefix[n-1]-prefix[i];
            if(prefix[i]>=p)
            c++;
            // if()
          }
        return c;
    }
}