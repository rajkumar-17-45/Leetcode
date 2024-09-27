class Solution {
    List<List<Integer>> l=new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ds=new ArrayList<Integer>();
        backtrack(nums,ds,0);
        return l;
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