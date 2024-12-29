class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int n=nums.length;
        int l=0;
        while(i < n && j<n)
        {
            if( mp.containsKey(nums[j]))
            {
            if( mp.get(nums[j])==k)
            {
                // System.out.println("hai"+i);
               if(nums[j]==nums[i])
               i++;
               else
               {
                while(nums[i]!=nums[j] && !mp.isEmpty() )
                {
                if(mp.get(nums[i])==1)
                mp.remove(nums[i]);
                else
                mp.put(nums[i],mp.get(nums[i])-1);
               
                i++;
                }
                // if(i<j)
                i++;
                
               }
               if((j-i+1)>l)
               l=j-i+1;
                // System.out.println("afetr"+i+" "+mp);
            }
            else
            {
                mp.put(nums[j],mp.get(nums[j])+1);
                if((j-i+1)>l)
               l=j-i+1;
            }
            }
            else
            {
                mp.put(nums[j],1);
                 if((j-i+1)>l)
               l=j-i+1;
            }
            j++;
        }
        return l; 
    }
}