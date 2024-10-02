class Solution {
    List<List<Integer>> li=new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ds=new ArrayList<Integer>();
        backtrack(nums,ds,0,target);
        return li;
    }
    void backtrack(int nums[],List<Integer> ds,int i,int target)
    {
        if(target==0)
        {
       li.add(new ArrayList<Integer>(ds));
          return ;
        }
        for(int j=i;j<nums.length;j++)
        {
            if(j>i && nums[j]==nums[j-1])
            continue;
            if(nums[j]>target)
            break;
            ds.add(nums[j]);
            backtrack(nums,ds,j+1,target-nums[j]);
            ds.remove(ds.size()-1);
        }
    }
}