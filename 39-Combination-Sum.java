class Solution {
    List<List<Integer>> li=new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> ds=new ArrayList<Integer>();
        backtrack(nums,ds,target,0);
        return li;
    }
    void backtrack(int nums[],List<Integer> ds,int target,int i)
    {
        if(i==nums.length )
        {
            if(target==0)
            {
              li.add(new ArrayList<Integer>(ds));
            }
            return ;
        }
        // for( i=0;i<nums.length;i++)
        // {
        if(target>=nums[i])
        { 
         ds.add(nums[i]);
         backtrack(nums,ds,target-nums[i],i);
       ds.remove(ds.size()-1);
    }
     backtrack(nums,ds,target,i+1);
        // }
    }
}