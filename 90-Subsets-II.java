class Solution {
    Set<List<Integer>> l=new HashSet<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ds=new ArrayList<Integer>();
        backtrack(nums,ds,0);
        List<List<Integer>> result=new ArrayList<List<Integer>>(l);
        return result;
    }
    void backtrack(int nums[],List<Integer> ds,int i)
    {
      if(i==nums.length)
      {
     l.add(new ArrayList<Integer>(ds));
           return ;
      }
      ds.add(nums[i]);
      backtrack(nums,ds,i+1);
      ds.remove(ds.size()-1);
      backtrack(nums,ds,i+1);
    }
}