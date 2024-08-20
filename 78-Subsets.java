class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        fun(0,nums,a,new ArrayList<>());
      return a;
    }
    void fun(int i,int []nums,List<List<Integer>> ans,List<Integer> lis)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<Integer>(lis));
          return ;
        }
        lis.add(nums[i]);
        fun(i+1,nums,ans,lis);
        lis.remove(lis.size()-1);
        fun(i+1,nums,ans,lis);
    }
}