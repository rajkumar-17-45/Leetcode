class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list=new ArrayList<List<Integer>>();
       List<Integer> ds=new ArrayList<Integer>();
       boolean freq[]=new boolean[nums.length];
       backtrack(list,ds,freq,nums);
       return list;
     }
     void backtrack(List<List<Integer>> list,List<Integer> ds, boolean freq[],int[] nums)
     {
        if(ds.size()==nums.length)
        {
            list.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                backtrack(list,ds,freq,nums);
              
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
     }
}