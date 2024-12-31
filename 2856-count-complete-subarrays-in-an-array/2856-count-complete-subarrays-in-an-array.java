class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
    int count=0;
    HashSet<Integer> e=new HashSet<Integer>();
    for(int i:nums)
    e.add(i);
    int s=e.size();
    for(int i=0;i<nums.length;i++)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
    for(int j=i;j<nums.length;j++)
    {
       hs.add(nums[j]);  
       if(s==hs.size())
       {
        count++;
       } 
       if(s<hs.size())
       break;
    }
    }
    return count;
    }
}