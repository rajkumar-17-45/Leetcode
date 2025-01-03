class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int c=0;
        int i=0;
        int j=0;
        int n=nums.length;
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        long sum=0;
        long max=0;
        while(i<n && j<n) 
        {
            sum+=nums[j];
            if(!hm.containsKey(nums[j]))
            hm.put(nums[j],1);
            else
            {
              int val=nums[j];
              while(nums[i]!=val)
              {
                sum-=nums[i];
                hm.remove(nums[i]);
                i++;
              }
                sum-=nums[i];
              i++;
               
            }
            int l=j-i+1;   
            if(l>k)
            {
                sum-=nums[i];
                hm.remove(nums[i]);
                i++;
            }
            l=j-i+1;
            if(l==k)
            max=Math.max(max,sum);
            j++;
        }
        return max;
    }
}
